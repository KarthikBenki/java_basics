package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] ints = takeInput();
        spiralPrint(ints);
    }

    public static void spiralPrint(int matrix[][]) {
        int count = 0;
        int rows = matrix.length;
        if (rows == 0) {
            System.out.println(0);
            return;
        }
        int cols = matrix[0].length;

        int totalElements = rows * cols;

        int rs = 0, cs = 0;
        int ce = cols - 1;
        int re = rows - 1;

        while (count < totalElements) {
            for (int i = cs; i <= ce; i++) {
                System.out.print(matrix[rs][i] + " ");
                count++;
            }
            rs++;

            if (count < totalElements)
                for (int i = rs; i <= re; i++) {
                    System.out.print(matrix[i][ce] + " ");
                    count++;
                }
            ce--;
            if (count < totalElements)
                for (int i = ce; i >= cs; i--) {
                    System.out.print(matrix[re][i] + " ");
                    count++;
                }
            re--;

            if (count < totalElements)
                for (int i = re; i >= rs; i--) {
                    System.out.print(matrix[i][cs] + " ");
                    count++;
                }
            cs++;

        }
    }
}
