package fundamentals.array.arraybasics;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class PairSum {

    public static int pairSum(int arr[], int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1 ; j < arr.length; j++) {
                if (arr[i] + arr[j] == x ) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        int x = scanner.nextInt();
        System.out.println(pairSum(arr, x));
    }
}
