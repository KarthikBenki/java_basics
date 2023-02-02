package oops.classesandobjects;

public class Student {

    public final static double CONVERSION_FACTOR = 0.95;
    private String name;
    private int rollNumber;
    double cgpa;
    private static int numberOfStudents;


    public Student(String name) {
        this.name = name;
        this.rollNumber = numberOfStudents++;
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        if (rollNumber > 0)
            this.rollNumber = rollNumber;
        System.out.println(this);
    }


    public String toString() {
        return name + " " + rollNumber;
    }

}
