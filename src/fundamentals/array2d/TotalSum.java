package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.print2DArray;
import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class TotalSum {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        print2DArray(arr);
        totalSum(arr);
//        totalSum(arr, arr.length);
    }

    public static void totalSum(int[][] mat) {
        int n = mat.length;
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int sum = 0;

        sum = getBoundarySum(mat, n, sum) + getDiagonalSum(mat, n, sum) + checkForOdd(mat, n, sum);

        System.out.println(sum);

    }

    private static int checkForOdd(int[][] mat, int n, int sum) {
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }
        return sum;
    }

    private static int getDiagonalSum(int[][] mat, int n, int sum) {
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][i] + mat[i][n - 1 - i];
        }
        return sum;
    }

    private static int getBoundarySum(int[][] mat, int n, int sum) {
        for (int i = 0; i < n; i++) {
            sum += mat[i][0] + mat[i][n - 1];
        }

        //first and last column
        for (int i = 1; i < n - 1; i++) {
            sum += mat[i][0] + mat[i][n - 1];
        }
        return sum;
    }


    public static void totalSum(int[][] arr, int N) {
        int requiredSum = 0;

        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < N; i++) {

            // Loop from j = N-1 for columns
            for (int j = 0; j < N; j++) {

                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    requiredSum += arr[i][j];
                }

                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1 || j == N - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }

        // Print the final Sum
        System.out.println(requiredSum);
    }

    private static int getBoundarySum(int[][] mat, int n) {
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            sum += mat[0][i];
            sum += mat[n - 1][i];
            sum += mat[i][0];
            sum += mat[i][n - 1];

        }
        return sum;
    }

    private static int getSecondDiagonalSum(int[][] mat, int n) {
        int currRow = 0;
        int currCol = n - 1;
        int diaSum = 0;
        while (currRow < n && currCol >= 0) {
            diaSum += mat[currRow][currCol];
            currRow += 1;
            currCol -= 1;
        }
        return diaSum;
    }

    private static int getFirstDiagonalSum(int[][] mat, int n) {
        int currRow = 0;
        int currCol = 0;

        int diaSum = 0;
        while (currRow < n && currCol < n) {
            diaSum += mat[currRow][currCol];
            currRow += 1;
            currCol += 1;
        }
        return diaSum;
    }


}
