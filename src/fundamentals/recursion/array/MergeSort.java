package fundamentals.recursion.array;


public class MergeSort {
    public static void main(String[] args) {
        int a[] = {10, 7, 9, 6, 5, 8, 2, 1};

        mergeSort(a);

        for (int ele : a) {
            System.out.println(ele + " ");
        }
    }

    public static void mergeSort(int[] input) {

        if (input.length <= 1) return;

        int mid = input.length / 2;

        int arr1[] = new int[mid];
        int arr2[] = new int[input.length - mid];

        for (int i = 0; i < mid; i++) {
            arr1[i] = input[i];
        }

        for (int i = mid, k = 0; i < input.length; i++, k++) {
            arr2[k] = input[i];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(input, arr1, arr2);
    }

    public static void merge(int[] arr, int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < arr1.length && k < arr2.length) {
            if (arr1[j] > arr2[k]) {
                arr[i++] = arr2[k++];
            } else if (arr1[j] == arr2[k]) {
                arr[i++] = arr2[k++];
            } else {
                arr[i++] = arr1[j++];
            }
        }

        while (j < arr1.length) {
            arr[i++] = arr1[j++];
        }

        while (k < arr2.length) {
            arr[i++] = arr2[k++];
        }
    }
}
