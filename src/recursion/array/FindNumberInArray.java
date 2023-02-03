package recursion.array;

public class FindNumberInArray {
    public static void main(String[] args) {
        int num = -2;
        boolean isFound = findNumberInArray(new int[]{1, 2, 3, -2, 4}, num);
        System.out.println(isFound);
    }

    private static boolean findNumberInArray(int[] arr, int num) {
        if (arr[0] == num) return true;
        if (arr.length == 1 && arr[0] != num) return false;

        int[] smallArray = new int[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            smallArray[i - 1] = arr[i];
        }

        boolean smallOutput = findNumberInArray(smallArray, num);

        return smallOutput;
    }
}
