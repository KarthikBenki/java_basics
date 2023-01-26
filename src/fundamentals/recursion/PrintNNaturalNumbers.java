package fundamentals.recursion;

public class PrintNNaturalNumbers {
    public static void main(String[] args) {
        int n = 10;
        printNaturals(n);
        System.out.println();
        printNaturalsReverse(n);
    }

    private static void printNaturalsReverse(int n) {
        if (n == 0) return;
        System.out.print(n+" ");
        printNaturalsReverse(n-1);
    }

    private static void printNaturals(int n) {
        if (n == 0) return;
        printNaturals(n - 1);
        System.out.print(n + " ");
    }


}
