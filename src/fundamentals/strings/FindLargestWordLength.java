package fundamentals.strings;

import java.util.Arrays;
import java.util.Comparator;

public class FindLargestWordLength {
    public static void main(String[] args) {
        String str = "Full Stack Developer";
        String lg = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
        System.out.println(lg);
    }
}
