package fundamentals.array2d;

import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.print2DArray;
import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.takeInput;

public class TotalSum {
    public static void main(String[] args) {
        int[][] arr = takeInput();
        print2DArray(arr);
        totalSum(arr);
    }

    public static void totalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        //boundary elements first and last row
        for(int i = 0;i<n;i++){
            sum+=mat[i][0]+mat[i][n-1];
        }

        //first and last column
        for(int i = 1;i<n-1;i++){
            sum+=mat[i][0]+mat[i][n-1];
        }

        //diagonals
        for(int i = 1;i<n-1;i++){
            sum+=mat[i][i]+mat[i][n-1-i];
        }

        if(n%2!=0){
            sum-=mat[n/2][n/2];
        }

        System.out.println(sum);

    }
}
