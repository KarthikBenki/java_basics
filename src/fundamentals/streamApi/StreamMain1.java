package fundamentals.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMain1 {
    public static void main(String[] args) {
        //Create a list and filter all even numbers from list

        List<Integer> list1 = Arrays.asList(2, 4, 3, 50, 21, 67);

        List<Integer> collect = list1
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
