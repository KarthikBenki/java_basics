package oops.pillars.vehicle;

public abstract class Vehicle {
    private String color;
    protected int maxSpeed;

    public Vehicle(){
        System.out.println("vehicles constructor");
    }

   public void print() {
        System.out.println("color " + color + " maxSpeed " + maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract boolean isMotorized();

   public abstract String getCompany();
}

