package fundamentals.array.searchingandsorting;

import java.util.Arrays;
import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class PushZerosToEnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        takeInput(scanner,arr);

        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void pushZerosToEnd(int[] arr) {
        int temp[] = new int[arr.length];
        int j = 0;
        for (int i = 0;i<arr.length; i++){
            if (arr[i] > 0) {
                temp[j++] = arr[i];
            }
        }

        for (int i = 0,k=0; i < arr.length; i++,k++) {
            arr[i] = temp[k];
        }
    }


}
