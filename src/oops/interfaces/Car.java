package oops.interfaces;

public class Car extends Vehicle implements VehicleInterface,CarInterface {
    @Override
    public boolean isMotorized() {
        return true;
    }

    @Override
    public String getCompany() {
        return "BMW";
    }


    @Override
    public int numOfGears() {
        return 5;
    }
}
