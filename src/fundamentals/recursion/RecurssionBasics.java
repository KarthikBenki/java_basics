package fundamentals.recursion;

public class RecurssionBasics {
    public static void main(String[] args) {
        int n = 3;
        printNameNTimes(n, n);
    }

    private static void print1ToNBackTrack(int i, int n) {
        if (i < 1) return;

        print1ToNBackTrack(i - 1, n);

        System.out.println(i);
    }

    private static void printNToOneBackTrack(int i, int n) {
        if (i > n) return;

        printNToOneBackTrack(i + 1, n);

        System.out.println(i);
    }

    private static void printOneToN(int i, int n) {
        if (i > n) return;

        System.out.println(i);

        printOneToN(i + 1, n);
    }

    private static void printNToOne(int i, int n) {
        if (i < 1) return;

        System.out.println(i);

        printNToOne(i - 1, n);
    }

    private static void printNameNTimes(int i, int n) {
        if (i < 1) return;

        printNameNTimes(i - 1, n);

        System.out.println("Name is Sachin");
    }

}
