import java.util.LinkedList;
import java.util.Scanner;
public class DoctorAppointment_LinkedListCollections {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String> waitingList = new LinkedList<>();
        while (true) { 
            System.out.println("\n----------------------Doctor's Apppointment System------------------------");
            System.out.println("1. Add Patient");
            System.out.println("2. Service to Patient");
            System.out.println("3. View WaitingList");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter patient name : ");
                    String name=sc.nextLine();
                    waitingList.add(name);
                    System.out.println(name+" is added to the waiting list...");
                    break;
                case 2:
                    if(!waitingList.isEmpty()){
                        String served=waitingList.removeFirst();
                        System.out.println(served +" has been visited by doctor.");
                    }else{
                        System.out.println("No patients in the queue.......");
                    }
                    break;
                case 3:
                    System.out.println("Current Waiting List: \n"+waitingList);
                    break;
                case 4:
                System.out.println("Exiting system....Thank you....");
                sc.close();
                return;
                default:
                System.out.println("Enter from [1-4] options only");
                    
            }
        }
    }
}
