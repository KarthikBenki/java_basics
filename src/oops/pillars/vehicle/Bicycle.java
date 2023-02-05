package oops.pillars.vehicle;

public abstract class Bicycle extends Vehicle {

    public Bicycle() {
        System.out.println("bicycle constructor");
    }

    @Override
    public boolean isMotorized() {
        return false;
    }
}
