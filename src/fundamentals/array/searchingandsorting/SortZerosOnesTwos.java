package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class SortZerosOnesTwos {

    public static void sort012(int[] arr) {
        int zero = checkCount(0, arr);
        int one = checkCount(1, arr);
        int two = checkCount(2, arr);
        for (int i = 0; i < arr.length; ) {
            int j = 0;
            while (j < zero) {
                arr[i++] = 0;
                j++;
            }
            j = 0;
            while (j < one) {
                arr[i++] = 1;
                j++;
            }
            j = 0;
            while (j < two) {
                arr[i++] = 2;
                j++;
            }
        }
    }

    private static int checkCount(int n, int[] arr) {
        int count = 0;
        for (int ele : arr) {
            if (ele == n) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        sort012(arr);
        printArray(arr);
    }
}
