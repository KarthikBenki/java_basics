package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class LargestColumnSum {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        int largestColSum = largestColumnSum(arr);
        System.out.println(largestColSum);
    }

    public static int largestColumnSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = 0;
        int largestSum = Integer.MIN_VALUE;
        for (int i = 0; i < cols; i++) {
            sum = 0;
            for (int j = 0; j < rows; j++) {
                sum += arr[j][i];
            }
            largestSum = largestSum < sum ? sum : largestSum;
        }
        return largestSum;
    }
}
