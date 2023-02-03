package recursion.array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int index = binarySearch(a, 0, a.length - 1, 5);
        System.out.println(index);
    }


    public static int binarySearch(int a[], int si, int ei, int x) {
        if (si > ei) return -1;
        int mid = (si + ei) / 2;
        if (a[mid] == x) return mid;
        else if (a[mid] > x) {
            return binarySearch(a, si, mid, x);
        } else {
            return binarySearch(a, mid + 1, ei, x);
        }

    }

}
