package recursion.array;

public class SplitArray {
    public static boolean splitArray(int input[]) {
        return splitArray(input,0,0,0);

    }

    public static boolean splitArray(int arr[], int startIndex, int leftArraySum, int rightArraySum) {


        if (startIndex == arr.length) {
            return leftArraySum == rightArraySum;
        }

        if (arr[startIndex] % 5 == 0) {
            leftArraySum += arr[startIndex];
        } else if (arr[startIndex] % 3 == 0) {
            rightArraySum += arr[startIndex];
        } else {
            return splitArray(arr, startIndex + 1, leftArraySum + arr[startIndex], rightArraySum) || splitArray(arr, startIndex + 1, leftArraySum, rightArraySum + arr[startIndex]);
        }

        return splitArray(arr, startIndex + 1, leftArraySum, rightArraySum);
    }

}
