package fundamentals.strings;

public class ReverseEachWordOfString {
    public static String reverseEachWord(String str) {
        String reverse = "";
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                endIndex = i - 1;
                reverse = getReverse(str, reverse, startIndex, endIndex);
                reverse = reverse.concat(" ");
                startIndex = i + 1;
            }

            if (i == str.length() - 1) {
                endIndex = i;
                reverse = getReverse(str, reverse, startIndex, endIndex);
            }
        }
        return reverse;
    }

    private static String getReverse(String str, String reverse, int startIndex, int endIndex) {
        for (int j = endIndex; j >= startIndex; j--) {
            reverse += str.charAt(j);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String str = "abc def ghi jkl mno";
        String s = reverseEachWord(str);
        System.out.println(s);
    }
}
