package fundamentals.array;

import java.util.Arrays;
import java.util.Comparator;

public class MinLengthOfAWord {
    public static String minLengthWord(String input) {
        String s = Arrays.stream(input.split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse(null);
        return s;
    }

    public static void main(String[] args) {
        String s = "this is test string";
        String s1 = minLengthWord(s);
        System.out.println(s1);


    }
}
