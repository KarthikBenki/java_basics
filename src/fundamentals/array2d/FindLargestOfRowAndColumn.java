package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.print2DArray;
import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class FindLargestOfRowAndColumn {
    public static void main(String[] args) {
        int[][] arr2D = takeInput();
        findLargest(arr2D);
        print2DArray(arr2D);

    }

    public static void findLargest(int[][] mat) {
        String name = "row";
        int index = 0;
        int largestSum = Integer.MIN_VALUE;
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            int sum=0;
            for (int j = 0; j < cols; j++) {
                sum += mat[i][j];
            }
            if (largestSum < sum) {
                largestSum = sum;
                index = i;
            }
        }

        for (int i = 0; i < cols; i++) {
           int sum=0;
            for (int j = 0; j < rows; j++) {
                sum += mat[j][i];
            }
            if (largestSum < sum) {
                name = "column";
                largestSum = sum;
                index = i;
            }
        }

        System.out.println(name+" "+index+ " "+largestSum );
    }
}
