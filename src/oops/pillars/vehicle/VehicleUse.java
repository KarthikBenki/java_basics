package oops.pillars.vehicle;



public class VehicleUse {
    public static void main(String[] args) {

        Car car = new Car();
        car.maxSpeed = 100;
        car.isMotorized();
        System.out.println("maxSpeed :  " + car.maxSpeed);
        System.out.println("motorised : " + car.isMotorized());

        System.out.println();

        Bicycle bicycle = new Bicycle();
        bicycle.maxSpeed = 50;
        System.out.println("maxSpeed :  " + bicycle.maxSpeed);
        System.out.println("motorised : " + bicycle.isMotorized());
    }
}

