package fundamentals.array.arraybasics;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;
import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class IntersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i]+" ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr1[] = new int[n];
        takeInput(scanner, arr1);
        printArray(arr1.length,arr1);
        System.out.println();

        int m = scanner.nextInt();

        int arr2[] = new int[m];
        takeInput(scanner, arr2);
        printArray(arr2.length,arr2);
        System.out.println();

        intersections(arr1, arr2);
    }
}
