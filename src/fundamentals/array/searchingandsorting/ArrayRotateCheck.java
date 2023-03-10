package fundamentals.array.searchingandsorting;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class ArrayRotateCheck {
    public static int arrayRotateCheck(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >arr[i+1]) count = i+1;
        }
        return count;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner, arr);
        System.out.println(arrayRotateCheck(arr));
    }
}
