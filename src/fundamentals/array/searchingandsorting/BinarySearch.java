package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        int x = scanner.nextInt();

        takeInput(scanner, arr);
        printArray(arr.length, arr);

        System.out.println(binarySearch(arr, x));
    }

    private static int binarySearch(int[] arr, int x) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] < x) {
                s = mid + 1;
            } else if (arr[mid] > x) {
                e = mid - 1;
            }
        }

        return -1;
    }
}
