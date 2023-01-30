package fundamentals.recursion;

public class Assignments {
    public static void main(String[] args) {
        int number = 12345;
        int sum = sumOfDigits(number);
        System.out.println(sum);
    }

    private static int sumOfDigits(int input) {
        if (input == 0) return input;

        int smallOutput = input % 10;
        int output = smallOutput + sumOfDigits(input / 10);
        return output;
    }
}
