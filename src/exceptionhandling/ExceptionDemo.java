package exceptionhandling;

public class ExceptionDemo {
    public static void main(String[] args)  {

            devideByZero(10,0);


    }

    private static void devideByZero(int numerator, int denominator)  {
       if (denominator == 0)
           try {
               throw new DevideByZeroException("denominator must not be zero");
           } catch (DevideByZeroException ex) {
               throw new RuntimeException(ex);
           }finally {
               System.out.println("Finally block excecuted");
           }
       }

}
