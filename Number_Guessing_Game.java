import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();
        int random_num=r.nextInt(100)+1;
        int guess;
        int attempt=0;
        System.out.println("-----Welcome to guessing game-----");
        System.out.println("Enter the number from 1 to 100 to guess till you guess correct...");
        do { 
            System.out.print("Enter a guess : ");
            guess=sc.nextInt();
            attempt++;
            if(guess==random_num)
            {
                System.out.println("You guessed it correct.");
                System.out.println("Congratulations you won in your "+attempt+" attempt.");
                System.out.println("Do you want to replay... if yes press yes... otherwise press no....");
                sc.nextLine();
                String s=sc.nextLine();
                s=s.toLowerCase();
                if(s.equals("no") || s.equals("n")){
                    System.out.println("Thanks for playing!!!");
                break;
                }
                else{
                     random_num=r.nextInt(100)+1;
                    attempt=0;
                }
                

            }
            else{
                if(guess> random_num)
                System.out.println("Higher than the number to be guessed....");
                else
                System.out.println("Lower than the number to be guessed");

            }
        }while(true);
        sc.close();
    }
}
