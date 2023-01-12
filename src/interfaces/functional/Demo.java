package interfaces.functional;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface MyFunctionalInterface{
    void print(String msg);

    default void show(){
        System.out.println("Show movies");
    }

    static void snow(){
        System.out.println("static method");
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj = () ->
                System.out.println("Hello World");



        obj.show();
    }
}


