package fundamentals.array2d;


public class PrintArrayNTimes {
    public static void main(String[] args) {


        int n = 3;
        int m = 3;
        int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


        for (int i = 0; i < input.length; i++) {
            for (int k = 0; k < input.length - i; k++) {
                for (int j = 0; j < input[0].length; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
}
