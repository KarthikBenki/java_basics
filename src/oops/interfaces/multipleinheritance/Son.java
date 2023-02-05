package oops.interfaces.multipleinheritance;

public class Son implements Father,Mother{
    @Override
    public void eat() {
        System.out.println("Son eats");
    }
}
