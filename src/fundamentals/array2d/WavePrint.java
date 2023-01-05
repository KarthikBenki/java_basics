package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class WavePrint {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        wavePrint(arr);

    }

    public static void wavePrint(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < cols; i++) {
            if (i % 2 == 0)
                for (int j = 0; j < rows; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            else{
                for (int j = rows-1; j>=0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }
        }
    }
}
