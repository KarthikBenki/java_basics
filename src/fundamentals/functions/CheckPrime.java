package fundamentals.functions;

public class CheckPrime {
    public static void main(String[] args) {
        int n = 6;
        boolean result = isPrimeReturn(n);
        System.out.println(result);
        result = isPrimeBreak(n);
        System.out.println(result);
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
}
