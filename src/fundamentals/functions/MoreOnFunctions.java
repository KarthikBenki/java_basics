package fundamentals.functions;

public class MoreOnFunctions {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printEvenNumbers() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }

    }

    public static void printEvenNumbers(int start, int end) {
        if (start % 2 != 0)
            start++;
        for (int i = start; i <= end; i = i + 2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        printEvenNumbers(3,17);
    }

}
