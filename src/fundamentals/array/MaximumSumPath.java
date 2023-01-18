package fundamentals.array;

// JAVA program to find maximum sum path
class MaximumSumPath {


    public static int max(int x, int y) {
        return (x > y) ? x : y;
    }

    public static long maximumSumPath(int input1[], int input2[], int m, int n) {

        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;

        while (i < m && j < n) {
            if (input1[i] < input2[j])
                sum1 += input1[i++];

            else if (input1[i] > input2[j])
                sum2 += input2[j++];

            else {
                result += max(sum1, sum2) + input1[i];

                sum1 = 0;
                sum2 = 0;

                i++;
                j++;
            }
        }

        while (i < m)
            sum1 += input1[i++];

        while (j < n)
            sum2 += input2[j++];

        result += max(sum1, sum2);

        return result;
    }

    public static long maximumSumPath(int[] input1, int[] input2) {

        if (!isIntersect(input1,input2)){
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < input1.length; i++) {
                sum1+=input1[i];
            }

            for (int i = 0; i < input2.length; i++) {
                sum2+=input2[i];
            }

            return max(sum1,sum2);
        }

        int i = 0, j = 0;
        int result = 0, sum1 = 0, sum2 = 0;
        int m = input1.length;
        int n = input2.length;

        while (i < m && j < n) {
            if (input1[i] < input2[j])
                sum1 += input1[i++];

            else if (input1[i] > input2[j])
                sum2 += input2[j++];

            else {
                result += max(sum1, sum2) + input1[i];

                sum1 = 0;
                sum2 = 0;

                i++;
                j++;
            }
        }

        while (i < m)
            sum1 += input1[i++];

        while (j < n)
            sum2 += input2[j++];

        result += max(sum1, sum2);

        return result;
    }

    public static boolean isIntersect(int arr1[], int arr2[]) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Driver code
    public static void main(String[] args) {
        MaximumSumPath sumpath = new MaximumSumPath();
        int ar1[] = {1,3,5,7};
        int ar2[] = {2, 4, 6,8};
        int m = ar1.length;
        int n = ar2.length;

        // Function call
        System.out.println(
                "Maximum sum path is :"
                        + sumpath.maximumSumPath(ar1, ar2));
    }
}

// This code has been contributed by Mayank Jaiswal

