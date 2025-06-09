
import java.util.Scanner;

class Vehicles{
    private String model;
    private int speed;
    private final int MAX_SPEED = 120; //speed limit of vehicle
    public Vehicles(String model){
        this.model=model;
        this.speed=0;
    }
    // public void setSpeed(int speed){
    //     this.speed=speed;
    // }
    public int getSpeed(){
        return speed;
    }
    //method to increase the speed from 0 to 120
    public void acceleration(int increment){
        if(speed + increment <=MAX_SPEED)
        {
            speed+=increment;
            System.out.println("Increse speed by "+increment+" km/hr.");
        }else{
            speed=MAX_SPEED;
            System.out.println("Reached Maximum speed "+MAX_SPEED+" km/hr.");
        }   
    }
    // method to initialize proximity warninng to decrease  the speed
    public void brake(int decrement){
        if(speed-decrement >= 0){
            speed-=decrement;
            System.out.println("Brake by "+decrement+ " km/hr.");
        }
        else{
            speed=0;
            System.out.println("Vehicle stopped.");
        }
    }
    public String getModel(){
        return model;
    }
}
public class Vehicle_Speed_Tracking_System{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter model name : ");
        String model=sc.nextLine();
        Vehicles car = new Vehicles(model);
        System.out.println("Current speed : "+ car.getSpeed()+ " km/hr");
        System.out.println("Enter speed to accelerate : ");
        int acc=sc.nextInt();
        car.acceleration(acc);
        System.out.println("Enter speed to brake : ");
        int brake=sc.nextInt();
        car.brake(brake);
        System.out.println("Current speed "+car.getSpeed()+" km/hr.");
    }
}
