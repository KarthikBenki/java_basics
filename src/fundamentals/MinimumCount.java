package fundamentals;

public class MinimumCount {
    public static void main(String[] args) {

    }

    public static int minCount(int n){
        if (n <= 3)
            return n;

        int result = n;

        for (int x = 1; x <= n; x++)
        {
            int temp = x * x;
            if (temp > n)
                break;
            else
                result = Math.min(result, 1 +
                        minCount(n - temp));
        }
        return result;
    }
}
