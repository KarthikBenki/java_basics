package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;


public class InsertionSortForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        takeInput(scanner, arr);
        System.out.println("Before sorting....");
        printArray(arr);
        insertionSort(arr);

        System.out.println("After sorting....");
        printArray(arr);

    }

    public static void insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
