package oops.pillars.vehicle;

public abstract class Car extends Vehicle {
    public Car() {
        System.out.println("Cars constructor");
    }

    @Override
    public boolean isMotorized() {
        return true;
    }


}
