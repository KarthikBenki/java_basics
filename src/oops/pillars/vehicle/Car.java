package oops.pillars.vehicle;

public class Car extends Vehicle {
    public Car() {
        System.out.println("Cars constructor");
    }

    @Override
    boolean isMotorized() {
        return true;
    }
}
