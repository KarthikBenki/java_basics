package fundamentals.array.arraybasics;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class FindTheLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner,arr);
        int largest = findLargest(arr);
        System.out.println("largest is "+ largest);
    }

    private static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int element : arr) {
            if (max < element) max = element;
        }
        return max;
    }
}
