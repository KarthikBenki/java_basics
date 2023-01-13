package fundamentals.array.searchingandsorting;

import java.util.Arrays;
import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class PushZerosToEnd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        takeInput(scanner,arr);

        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void pushZerosToEnd(int[] arr) {
        int j = 0;
        for (int i = 0;i<arr.length; i++){

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }


}
