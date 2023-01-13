package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the element to find in array");
        int x = scanner.nextInt();

        System.out.println("Enter array elements");
        takeInput(scanner, arr);

        System.out.println("printing array elements");
        printArray(arr.length, arr);
        System.out.println();

        System.out.println(x+" found at index : "+binarySearch(arr, x));
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
