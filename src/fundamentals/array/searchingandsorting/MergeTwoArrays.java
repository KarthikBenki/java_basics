package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class MergeTwoArrays {

    public static int[] merge(int arr1[], int arr2[]) {
        int n = arr1.length + arr2.length;

        int arr[] = new int[n];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (k < n) {
            if (i < arr1.length) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first array elements size");
        int m = scanner.nextInt();
        int arr1[] = new int[m];
        takeInput(scanner, arr1);
        printArray(arr1);
        System.out.println("enter the first array elements size");
        int n = scanner.nextInt();
        int arr2[] = new int[n];
        takeInput(scanner, arr2);
        printArray(arr2);

        int[] merge = merge(arr1, arr2);

        printArray(merge);


    }
}
