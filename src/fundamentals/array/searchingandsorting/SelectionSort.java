package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        takeInput(scanner, arr);
        System.out.println("Before sorting....");
        printArray(arr);
        selectionSort(arr);

        System.out.println("After sorting....");
        printArray(arr);

    }


    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}
