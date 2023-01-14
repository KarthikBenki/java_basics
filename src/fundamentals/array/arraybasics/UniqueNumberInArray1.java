package fundamentals.array.arraybasics;

import java.util.Scanner;

public class UniqueNumberInArray1 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int arr[] = new int[n];
        

    }

    public static int findUnique(int[] arr) {

        int x = 0;

        for (int i = 0; i < arr.length; i++) {
            x ^= arr[i];
        }

        return x;
    }
}
