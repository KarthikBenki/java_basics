package fundamentals.recursion;

public class CheckForArraySort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        boolean sorted = isSorted(arr);
        System.out.println(sorted);
    }

    private static boolean isSorted(int arr[]) {
        if (arr.length == 1) return true;

        if (arr[0] > arr[1]) {
            return false;
        }

        int smallArray[] = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }
        boolean isSmallArraySorted = isSorted(smallArray);
        return isSmallArraySorted;
    }
}
