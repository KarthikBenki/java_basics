package fundamentals.leetCode.easy;

import java.util.Scanner;

import static fundamentals.array.InputOfArray.printArray;
import static fundamentals.array.InputOfArray.takeInput;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        takeInput(scanner,arr);
        int target = scanner.nextInt();
        int[] out = twoSum(arr, target);
        printArray(out);
    }
}
