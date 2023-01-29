package fundamentals.recursion.array;

public class FirstIndexOfANumberInAnArray {


    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int x = 2;

        int ans = findFirstIndexOf(a, x);
        System.out.println(ans);

        int ans1 = firstIndex(a,x);
        System.out.println(ans1);
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

    public static int firstIndex(int a[], int x) {
        return firstIndex(a, x, 0);
    }

    private static int firstIndex(int[] a, int x, int i) {
        if (i == a.length) return -1;
        if (a[i] == x) return i;

        return  firstIndex(a,x,i+1);
    }
}
