package fundamentals.array;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.printArray;


public class EquilibriumIndexOfAnArray {
    public static void main(String[] args) {
        int[] ints = takeInputArray();
        printArray(ints);
        int index = arrayEquilibriumIndex(ints);
        System.out.println(index);
    }

    public static int arrayEquilibriumIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;
        int totalSum = 0;
        //to find a right sum
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        //calculating right sum and equating with right sum if same return index
        //else add ith element to left sum and increment i to next index

        for (int i = 0; i < arr.length; i++) {
            rightSum = totalSum - leftSum - arr[i];
            if (leftSum == rightSum) return i;
            leftSum+=arr[i];
        }
        return -1;
    }

    public static int arrayEquilibriumIndex1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return i;
        }
        return -1;
    }

    public static int[] takeInputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of an array");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
