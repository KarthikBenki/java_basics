package fundamentals.array;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class SwapAlternate {
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        int n = arr.length;

        for (int i = 0; i < n-1; i = i + 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        takeInput(scanner, arr);

        swapAlternate(arr);

        printArray(arr.length, arr);
    }
}
