package fundamentals;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int subArraySize = scanner.nextInt();

        takeInput(scanner, n, arr);

        printMaxSubArraySum(arr,subArraySize);
    }

    private static void printMaxSubArraySum(int[] arr, int subArraySize) {
        int arrayLength = arr.length;
        int max_sum = 0;
        for (int i = 0; i + subArraySize <= arrayLength; i++) {
            int temp = 0;
            for (int j = i; j < i + subArraySize; j++) {
                temp += arr[j];
            }
            if (temp > max_sum)
                max_sum = temp;
        }

        System.out.println(max_sum);
    }

    private static void printArr(int[] arr) {
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }

    private static void takeInput(Scanner scanner, int n, int[] arr) {
        for (int i = 0; i< n; i++){
            arr[i] = scanner.nextInt();
        }
    }
}
