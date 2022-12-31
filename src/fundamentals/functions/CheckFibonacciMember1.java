package fundamentals.functions;

public class CheckFibonacciMember1 {

    public static boolean isPerfectSquare(int num) {
        int sr = (int) Math.sqrt(num);
        if (sr * sr == num) return true;
        return false;
    }

    public static boolean checkMember(int n) {
        int perfectSquare1 = ((5 * n * n) + 4);
        int perfectSquare2 = ((5 * n * n) - 4);

        if (isPerfectSquare(perfectSquare1) || isPerfectSquare(perfectSquare2)) return true;

        return false;
    }

}
