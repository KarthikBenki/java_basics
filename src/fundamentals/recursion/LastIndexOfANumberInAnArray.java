package fundamentals.recursion;

public class LastIndexOfANumberInAnArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 2, 4, 5, 3};
        int x = 2;

        int ans = lastIndex(a, x);
        int ans1 = lastIndexOfCopy(a, x);
        int ans2 = lastIndexBetter(a, x);

        System.out.println(ans);
        System.out.println(ans1);
        System.out.println(ans2);
    }

    private static int lastIndexBetter(int[] a, int x) {
        return lastIndexOf(a, x, 0);
    }

    private static int lastIndexOfCopy(int[] a, int x) {
        if (a.length == 0) return -1;

        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i - 1] = a[i];
        }

        int li = lastIndexOfCopy(smallArray, x);

        if (li != -1) return li + 1;
        else if (a[0] == x) return 0;
        else return -1;
    }

    private static int lastIndexOf(int[] a, int x, int si) {
        if (si == a.length) return -1;

        int li = lastIndexOf(a, x, si + 1);

        if (li != -1) return li;
        else if (a[si] == x) return si;
        else return -1;
    }

    private static int lastIndex(int[] input, int x) {
        return lastIndex(input, x, input.length - 1);
    }

    public static int lastIndex(int[] a, int x, int i) {
        if (i == -1) return i;
        if (a[i] == x) return i;

        return lastIndex(a, x, i - 1);
    }
}
