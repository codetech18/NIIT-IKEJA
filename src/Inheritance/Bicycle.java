package Inheritance;

public class Bicycle {
    int gear;
    int speed;
public Bicycle(int gear, int speed){
    this.gear = gear;
    this.speed = speed;
    }

    public void applyBrake(int decrement){

            speed -= decrement;
    }
    public void speedUp(int increment){

            speed += increment;
        System.out.println(speed);
    }
}
