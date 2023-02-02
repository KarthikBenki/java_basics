package oops.classesandobjects;

public class StudentUse {
    public static void main(String[] args) {
        Student s1 = new Student("Karthik M C");
        Student s2 = new Student("Vikas M S");
        Student s3 = new Student("Mouna M C");

//use class name to access the static variables
        int numberOfStudents = Student.getNumberOfStudents();
        System.out.println(numberOfStudents);
//        System.out.println(s1.getName());
//        System.out.println(s2.getRollNumber());


    }
}
