package oops.pillars.vehicle;

public class Bicycle extends Vehicle {

    public Bicycle() {
        System.out.println("bicycle constructor");
    }

    @Override
    boolean isMotorized() {
        return false;
    }
}
