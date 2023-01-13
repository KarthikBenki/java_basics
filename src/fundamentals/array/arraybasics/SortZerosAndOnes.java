package fundamentals.array.arraybasics;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class SortZerosAndOnes {
    public static void sortZeroesAndOne(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0) zeroCount++;
            else oneCount++;
        }

        for (int i = 0; i < zeroCount; i++) {
            arr[i] = 0;
        }

        for (int i = zeroCount; i < arr.length; i++) {
            arr[i] = 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        sortZeroesAndOne(arr);
        printArray(arr.length,arr);
    }
}
