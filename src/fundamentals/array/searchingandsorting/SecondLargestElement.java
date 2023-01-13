package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class SecondLargestElement {
    public static int secondLargestElement(int[] arr) {
        int n = arr.length;

        boolean isSame = true;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) isSame = false;
        }
        if (n <= 1 || isSame) return Integer.MIN_VALUE;

        int largest = arr[0];
        int secondLargest = arr[1];

        if (largest < secondLargest) {
            int temp = largest;
            largest = secondLargest;
            secondLargest = temp;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        int i = secondLargestElement(arr);
        System.out.println(i);
    }


}
