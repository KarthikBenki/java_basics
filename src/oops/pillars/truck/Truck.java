package oops.pillars.truck;

import oops.pillars.Vehicle;

public class Truck extends Vehicle {
    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.setColor("Violet");
        truck.maxSpeed=500;
        truck.print();


    }
}


