package fundamentals.recursion;

public class FirstIndexOfANumberInAnArray {


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int x = 0;

        int ans = findFirstIndexOf(a, x);
        System.out.println(ans);
    }

    private static int findFirstIndexOf(int[] a, int x) {
        if (a.length == 0) return -1;
        if (a[0] == x) return 0;

        int smallArray[] = new int[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            smallArray[i - 1] = a[i];
        }

        int fi = findFirstIndexOf(smallArray, x);
        if (fi == -1) return -1;
        else return fi + 1;
    }
}
