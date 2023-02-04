package oops.pillars;

public class Inheritance {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle car2 = new Car();

        car1.setColor("Yellow");
        car1.maxSpeed = 100;

        car2.setColor("Brown");
        car2.maxSpeed=200;

        car1.print();
        car2.print();
    }
}

class Vehicle {
    private String color;
    int maxSpeed;

    void print() {
        System.out.println("color " + color + " maxSpeed " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Car extends Vehicle {

}
