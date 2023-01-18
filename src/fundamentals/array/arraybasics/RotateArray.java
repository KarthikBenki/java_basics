package fundamentals.array.arraybasics;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(arr, 2);
        

        for (int ele : arr) {
            System.out.print(ele);
        }

    }

    public static void rotate(int[] arr, int d) {
        for (int i = 0, j = d - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        for (int i = d, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }
}
