package Inheritance;

public class Bikes extends Bicycle{

    int startSpeed;

    public Bikes(int gear, int speed, int startSpeed) {
        super(gear, speed);
        this.startSpeed = startSpeed;
    }

    public void seat(){

    }
    public void speedUp(int increment){
        super.speedUp(increment);
    }
}

