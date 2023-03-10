package dsa.arraylist;

import java.util.ArrayList;

public class RemoveConsecutiveElementsInAnArray {

    public static ArrayList<Integer> removeConsecutiveDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();

        result.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) result.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 20, 30, 40, 10};
        ArrayList<Integer> integers = removeConsecutiveDuplicates(arr);
        integers.forEach(e-> System.out.print(e+" "));
    }
}
