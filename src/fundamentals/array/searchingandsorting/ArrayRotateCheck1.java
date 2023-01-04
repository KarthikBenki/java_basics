package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.takeInput;

public class ArrayRotateCheck1 {
    public static int arrayRotateCheck(int[] arr) {

        if (isSortedArray(arr)) return 0;

        int n = arr.length;
        int count = 0;
        while (!isSortedArray(arr)) {
            count++;
            int temp = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n-1] = temp;
        }
        return count;

    }

    private static boolean isSortedArray(int[] array) {
        int n = array.length;
        if (n == 1 || n == 0) return true;
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) return false;
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        System.out.println(arrayRotateCheck(arr));
    }
}
