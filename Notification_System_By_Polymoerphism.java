import java.util.Scanner;
class Notification{
    void notifyUser(){
        System.out.println("Sending a general notification.....");
    }
}
//email notification
class EmailNotification extends Notification{
    void  notifyUser(){
        System.out.println("Sending E-Mail Notification to abc@example.com");
    }
}
//sms notification
class SMSNotification extends Notification{
    void notifyUser(){
        System.out.println("Sending SMS Notification to +91 8143726999");
    }
}
//push notification
class PushNotification extends Notification{
    void notifyUser(){
        System.out.println("Sending Push Notification mobile app- Whatsapp");
    }
}
public class Notification_System_By_Polymoerphism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Notification notify;
        System.out.println("Select notification type: ");
        System.out.println("1. E-Mail\n2. SMS\n3. WhatsApp");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
            notify=new EmailNotification();
            break;
            case 2:
            notify = new SMSNotification();
            break;
            case 3:
            notify=new PushNotification();
            break;
            default:
            notify=new Notification();
        }
        notify.notifyUser();
    }
}
