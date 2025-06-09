import java.util.Scanner;
class Booking{
    void bookTicket(){
        System.out.println("Bookint a general ticket - general mode");
    }
}
class TrainBooking extends Booking{
    void bookTicket(){
        System.out.println("Booking a train ticket...");
        System.out.println("----Booking Successful----");
        System.out.println("  L8  |  Coach D2  |Cost : 235");
    }
}
class BusTicket extends Booking{
    void bookTicket(){
        System.out.println("Booking a bus ticket...");
        System.out.println("----Booking successful----");
        System.out.println("  14W  | Ac  | Cost : 899");

    }
}
class FlightTicket extends Booking{
    void bookTicket(){
        System.out.println("Booking a Flight Ticket...");
        System.out.println("----Booking successful----");
        System.out.println("Business Class  |  Cost : 1,50,000");
    }
}
class Cab extends Booking{
    void bookTicket(){
        System.out.println("Booking a Cab...");
        System.out.println("----Booking Successful----");
        System.out.println("Toyota  |  Estimated Fare : 500");
    }
}
public class Ticket_Booking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Booking b;
        System.out.println("Welcome to Booking App!!!");
        System.out.println("To book required ticket press any of the following..");
        System.out.println("1. Train Ticket\n2. Bus Ticket\n3. Flight Ticket\n4. Cab");
        System.out.println("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            b=new TrainBooking();
            
            break;
            case 2:
            b=new BusTicket();
            
            break;
            case 3:
            b=new FlightTicket();
            
            break;
            case 4:
            b=new Cab();
            
            break;
            default:
            b=new Booking();
        }
        b.bookTicket();
    }
}