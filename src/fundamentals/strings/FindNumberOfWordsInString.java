package fundamentals.strings;

public class FindNumberOfWordsInString {
    public static int countWords(String str) {
        if(str.length() == 0) return str.length();
        int spaceCount = 1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') spaceCount++;
        }

        return spaceCount;
    }
}
