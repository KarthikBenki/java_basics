package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class RotateArrayDTimes {
    public static void rotate(int[] arr, int d) {
        int n = arr.length;
        int i = 0;
        while (i < d) {
           int j = 0;
           int temp = arr[j];
           while (j < n-1) {
               arr[j] = arr[j+1];
               j++;
           }
           arr[j] = temp;
           i++;
        }
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
