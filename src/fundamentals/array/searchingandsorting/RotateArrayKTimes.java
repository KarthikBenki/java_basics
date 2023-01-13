package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class RotateArrayKTimes {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        for (int i = 0, j = d - 1; i < j; i++, j--) {
            swap(arr, i, j);
        }

        for (int i = d, j = n - 1; i < j; i++, j--) {
            swap(arr, i, j);
        }

        for (int i = 0, j = n - 1; i < j; i++, j--) {
            swap(arr, i, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner,arr);
        int d = scanner.nextInt();
        printArray(arr);
        rotate(arr,d);
        printArray(arr);

    }
}
