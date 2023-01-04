package fundamentals.array.searchingandsorting;

import java.util.Arrays;
import java.util.Scanner;

import static fundamentals.array.InputOfArray.takeInput;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int arr1[] = new int[m];
        takeInput(scanner, arr1);
        int n = scanner.nextInt();
        int arr2[] = new int[n];
        takeInput(scanner,arr2);

        int num1 = extractArray(arr1);

        System.out.println(num1);

        int[] ints = convertToArray(num1);

        System.out.println(Arrays.toString(ints));


    }

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int num1 = extractArray(arr1);
        int num2 = extractArray(arr2);
        int sum = num1+num2;

        convertToArray(sum,output);


    }

    private static int[] convertToArray(int num) {
        int length = 0;
        int temp = num;
        while (temp != 0) {
            length++;
            temp = temp / 10;
        }

        int arr[] = new int[length];


        for (int i = length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;

    }



    private static int[] convertToArray(int num, int[] arr) {
        int length = arr.length;

        for (int i = length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        return arr;
    }

    private static int extractArray(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int j = 1;
            while (j < n - i) {
                arr[i] *= 10;
                j++;
            }
            sum += arr[i];
        }
        return sum;
    }
}
