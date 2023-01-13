package fundamentals.array.searchingandsorting;


import static fundamentals.array.arraybasics.InputOfArray.printArray;

public class MergeSortAlgorithm {


    public static void main(String[] args) {
        int arr[] = {9, 3, 7, 5, 6, 4, 8, 2};
        mergeSortAlgorithm(arr);
        printArray(arr);
    }

    public static void mergeSortAlgorithm(int[] arr) {
        if (arr.length <= 1) return;

        int mid = arr.length / 2;

        int[] arr1 = new int[mid];
        int[] arr2 = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            arr1[i] = arr[i];
        }
        int k = 0;

        for (int i = mid; i < arr.length; i++) {
            arr2[k] = arr[i];
            k++;
        }

        mergeSortAlgorithm(arr1);
        mergeSortAlgorithm(arr2);
        merge(arr, arr1, arr2);
    }

    public static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            arr[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            arr[k++] = arr2[j++];
        }

    }
}
