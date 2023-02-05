package oops.interfaces.multipleinheritance;

public class SonUse {
    public static void main(String[] args) {
        Son son = new Son();
        son.eat();
        System.out.println(Father.PI);
    }
}
