package fundamentals.functions;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(isPrime(47));
    }

    private static boolean isPrimeBreak(int n) {
        boolean isPrime = true;
        int div = 2;
        while (div <= n / 2) {
            if (n % div == 0) {
                isPrime = false;
                break;
            }
            div++;
        }
        return isPrime;
    }

    private static boolean isPrimeReturn(int n) {
        int div = 2;
        while (div <= n / 2) {
            if (n % div == 0) return false;
            div++;
        }
        return true;
    }

    public static boolean isPrime(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
                return false;
        }
        return true;

    }
}
