package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args)  {

            devideByZero(10,0);


    }

    private static void devideByZero(int numerator, int denominator)  {
        if (denominator == 0) try {
            throw new DevideByZeroException("Dont use zero in the denominator");
        } catch (DevideByZeroException e) {
            throw new RuntimeException(e);
        }
        System.out.println(numerator/denominator);
    }
}
