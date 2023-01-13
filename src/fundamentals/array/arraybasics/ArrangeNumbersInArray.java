package fundamentals.array.arraybasics;

import java.util.Scanner;

public class ArrangeNumbersInArray {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int arr[] = new int[n];
        arrange(arr, n);

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void arrange(int[] arr, int n) {
        int k = 1;
        if (arr.length % 2 == 0)
            for (int i = 0, j = n - 1; i < (n / 2); i++, j--) {
                arr[i] = k;
                arr[j] = k + 1;
                k += 2;
            }
        else {
            k = 1;
            for (int i = 0; i <= (n / 2 + 1); i++) {
                arr[i] = k;
                k+=2;
            }
            k = 2;
            for (int j = n - 1; j > n / 2; j--) {
                arr[j] = k;
                k += 2;
            }
        }
    }


}

