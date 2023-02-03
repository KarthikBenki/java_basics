package recursion.strings;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        boolean isPalindrome = checkPalindrome(s, 0);
        System.out.println(isPalindrome);
    }

    private static boolean checkPalindrome(String s, int i, int j) {
        if (i >= j) return true;

        if (s.charAt(i) != s.charAt(j)) return false;

       return checkPalindrome(s, i + 1, j - 1);
    }

    private static boolean checkPalindrome(String s, int i) {
        if (i >= s.length()/2) return true;

        if (s.charAt(i) != s.charAt(s.length()-i-1)) return false;

        return checkPalindrome(s, i + 1);
    }
}
