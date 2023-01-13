package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        takeInput(scanner, arr);
        System.out.println("Before sorting....");
        printArray(arr);
        bubbleSort(arr);

        System.out.println("After sorting....");
        printArray(arr);

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
