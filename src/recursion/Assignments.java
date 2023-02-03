package recursion;

public class Assignments {
    public static void main(String[] args) {
        int staircase = staircase(5);
        System.out.println(staircase);
    }

    public static int staircase(int n) {

        if (n == 1 || n == 0) return 1;

        if (n == 2) return 2;

        int smallAns1 = staircase(n - 1);
        int smallAns2 = staircase(n - 2);
        int smallAns3 = staircase(n - 3);

        int outPut = smallAns1 + smallAns2 + smallAns3;

        return outPut;
    }


    public static boolean isStringPalindrome(String input) {
        return isStringPalindrome(input, 0, input.length() - 1);

    }

    private static boolean isStringPalindrome(String input, int start, int end) {
        if (start >= end) return true;

        if (input.charAt(start) != input.charAt(end)) return false;

        return isStringPalindrome(input, start + 1, end - 1);
    }

    public static int convertStringToInt(String input) {
        if (input.length() == 1) return input.charAt(0) - 48;

        int smallAns = convertStringToInt(input.substring(0, input.length() - 1));

        int output = smallAns * 10 + (input.charAt(input.length() - 1) - 48);

        return output;
    }

    public static boolean checkAB(String input) {
        if (input.length() <= 1) {
            return false;
        }

        if (input.startsWith("aa")) return checkAB(input.substring(2));
        else if (input.startsWith("abb")) return checkAB(input.substring(3));
        else return false;
    }

    private static int sumOfDigits(int input) {
        if (input == 0) return input;

        int smallOutput = input % 10;
        int output = smallOutput + sumOfDigits(input / 10);
        return output;
    }

    public static int multiplyTwoIntegers(int m, int n) {
        if (n == 0) return 0;
        return m + multiplyTwoIntegers(m, n - 1);
    }

    public static double findGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }

        double smallAns = findGeometricSum(k - 1);

        double output = (1 / Math.pow(2, k)) + smallAns;

        return output;

    }

    public static String addStars(String s) {
        if (s.length() <= 1) {
            return s;
        }

        String smallAns = addStars(s.substring(1));

        if (s.charAt(0) == smallAns.charAt(0)) {
            return s.charAt(0) + "*" + smallAns;
        } else {
            return s.charAt(0) + smallAns;
        }

    }
}
