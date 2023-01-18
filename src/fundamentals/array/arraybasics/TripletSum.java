package fundamentals.array.arraybasics;

import java.util.Scanner;

import static fundamentals.array.arraybasics.InputOfArray.takeInput;

public class TripletSum {

    public static int findTriplet(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
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
        System.out.println(findTriplet(arr, x));
    }
}
