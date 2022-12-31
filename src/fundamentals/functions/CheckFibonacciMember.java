package fundamentals.functions;

public class CheckFibonacciMember {


    public static boolean checkMember(int n) {


        boolean result = true;

        if (n >= 0 && n <= Math.pow(10, 4)) {
            int fn0 = 0;
            int fn1 = 1;


            if(n == 0 || n==1) return true;

            while (true) {
                int fn = fn0 + fn1;
                if (fn == n) {
                    result =  true;
                    break;
                }
                fn0 = fn1;
                fn1 = fn;
                if (fn > n) {
                    result =  false;
                    break;
                }
            }
        }

        return result;
    }

}
