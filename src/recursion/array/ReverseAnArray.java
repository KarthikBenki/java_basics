package recursion.array;

import static fundamentals.array.arraybasics.InputOfArray.printArray;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        printArray(arr);

        reverseAnArrayTwoPointer(arr, 0, arr.length - 1);
        printArray(arr);
        reverseAnArray(arr, 0, arr.length);

        printArray(arr);
    }

    private static void reverseAnArray(int[] arr, int i, int n) {
        if (i >= n/2) return;

        swap(arr, i, n - i - 1);

        reverseAnArray(arr, i + 1, n);
    }

    private static void reverseAnArrayTwoPointer(int[] arr, int i, int j) {
        if (i >= j) return;

        swap(arr, i, j);

        reverseAnArrayTwoPointer(arr, i + 1, j - 1);
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
