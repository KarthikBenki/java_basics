package fundamentals.array2d;

public class SumOfRows {
    public static void rowWiseSum(int[][] mat) {
        for(int i = 0;i<mat.length;i++){
            System.out.print(sum(mat[i])+" ");
        }
    }

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}
