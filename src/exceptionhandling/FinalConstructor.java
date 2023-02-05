package exceptionhandling;

public class FinalConstructor {
    private static final FinalConstructor finalConstructor;

    static {
        finalConstructor = new FinalConstructor();
    }

    private FinalConstructor() {

    }

    public static FinalConstructor getInstance() {
       return finalConstructor;
    }
}

class FinalConstructorUse {
    public static void main(String[] args) {
        FinalConstructor instance = FinalConstructor.getInstance();
        FinalConstructor instance1 = FinalConstructor.getInstance();
        FinalConstructor instance2 = FinalConstructor.getInstance();

        System.out.println(instance);
        System.out.println(instance1);
        System.out.println(instance2);
    }
}
