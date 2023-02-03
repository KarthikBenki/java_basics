package recursion.array;

public class CheckForArraySort {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 4, 5};
        boolean sorted = isSorted(arr);
        boolean sorted1 = isSortedBetter(arr,0);
        System.out.println(sorted);
        System.out.println(sorted1);
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

    private static boolean isSortedBetter(int arr[], int si) {
        if (si == arr.length - 1) return true;

        if (arr[si] > arr[si + 1]) return false;

        boolean smallOutPut = isSortedBetter(arr, si + 1);

        return smallOutPut;
    }

}
