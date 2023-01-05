package fundamentals.array2d;

import java.util.Scanner;

public class  TakeInputAndGiveOutput2DArray {
    public static int[][] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = scanner.nextInt();
        System.out.println("Enter no of cols");
        int cols = scanner.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }

    public static void print2DArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] arr = takeInput();
        print2DArray(arr);

    }
}
