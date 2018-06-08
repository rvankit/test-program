package Interface;

public class Bicycle implements Vehicle {

    int speed;
    int gear;

    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        System.out.println(speed);
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        System.out.println(speed);
        speed = speed - decrement;
    }
    public void printStates() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}
