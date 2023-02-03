package recursion.array;

public class ArraySum {
    public static void main(String[] args) {
        int sum = arraySum(new int[]{1, 2, 3, 4, 5});
        System.out.println(sum);
    }

    private static int arraySum(int[] input) {
        if (input.length == 1) return input[0];
        int smallArray[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallArray[i - 1] = input[i];
        }
        int smallOutput = arraySum(smallArray);
        int output = input[0];
        output += smallOutput;
        return output;
    }
}
