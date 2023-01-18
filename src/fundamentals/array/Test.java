package fundamentals.array;

class Main
{
    // Function to find the maximum sum path in two given arrays.
    // The code is similar to the merge routine of the merge sort algorithm
    public static long maximumSumPath(int[] input1, int[] input2)
    {
        int sum = 0;
        int sum_x = 0, sum_y = 0;

        int m = input1.length, n = input2.length;

        // `i` and `j` denotes the current index of `X` and `Y`, respectively
        int i = 0, j = 0;

        // loop till `X` and `Y` are empty
        while (i < m && j < n)
        {
            // to handle the duplicate elements in `X`
            while (i < m-1 && input1[i] == input1[i+1]) {
                sum_x += input1[i++];
            }

            // to handle the duplicate elements in `Y`
            while (j < n-1 && input2[j] == input2[j+1]) {
                sum_y += input2[j++];
            }

            // if the current element of `Y` is less than the current element of `X`
            if (input2[j] < input1[i])
            {
                sum_y += input2[j];
                j++;
            }

            // if the current element of `X` is less than the current element of `Y`
            else if (input1[i] < input2[j])
            {
                sum_x += input1[i];
                i++;
            }

            else    // if (X[i] == Y[j])
            {
                // consider the maximum sum and include the current cell's value
                sum += Integer.max(sum_x, sum_y) + input1[i];

                // move both indices by 1 position
                i++;
                j++;

                // reset both sums
                sum_x = 0;
                sum_y = 0;
            }
        }

        // process the remaining elements of `X` (if any)
        while (i < m) {
            sum_x += input1[i++];
        }

        // process the remaining elements of `Y` (if any)
        while (j < n) {
            sum_y += input2[j++];
        }

        sum += Integer.max(sum_x, sum_y);
        return sum;
    }

    public static void main(String[] args)
    {
        int[] X = { 1 ,5, 10, 15, 20 ,25 };
        int[] Y = { 2 ,4 ,5 ,9 ,15 };

        System.out.println("The maximum sum is " + maximumSumPath(X, Y));
    }
}
