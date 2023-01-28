package fundamentals.recursion;

public class LastIndexOfANumberInAnArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,2,4,5,3};
        int x = 2;

        int ans = lastIndex(a,x);

        System.out.println(ans);
    }

    private static int lastIndex(int[] input, int x) {
        return  lastIndex(input,x,input.length-1);
    }

    public static int lastIndex(int[] a, int x, int i) {
        if (i==-1) return i;
        if (a[i]==x) return i;

        return  lastIndex(a,x,i-1);
    }
}
