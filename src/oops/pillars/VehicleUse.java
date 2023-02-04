package oops.pillars;

public class VehicleUse {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
        Car car = new Car();
    }
}

class Car extends Vehicle {
    public Car() {
        System.out.println("Cars constructor");
    }
}
