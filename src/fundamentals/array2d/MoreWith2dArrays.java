package fundamentals.array2d;


import static fundamentals.array2d.TakeInputAndGiveOutput2DArray.print2DArray;

public class MoreWith2dArrays {
    public static void main(String[] args) {
        int arr[][] = new int[4][];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[5];
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        int arr1[][] = new int[4][];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new int[i + 2];//jagged array
        }

        print2DArray(arr1);
    }
}
