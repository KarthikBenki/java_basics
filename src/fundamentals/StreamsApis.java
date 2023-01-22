package fundamentals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsApis {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);

        String s = "Hello i am ramachandar";

        List<String> strings = Arrays.asList(s.split(" "));

        String s1 = strings.stream().min(Comparator.comparingInt(String::length)).get();

        System.out.println(s1);

        String s2 = strings.stream().max(Comparator.comparingInt(String::length)).get();

        System.out.println(s2);


//        Stream<Integer> integerStream = list.stream().map(num -> num * 2);
//        List<Integer> collect = integerStream.collect(Collectors.toList());
//
//        System.out.println(collect);

        List<Integer> collect = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
        List<Integer> collect1 = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        list.stream().forEach(num -> System.out.print(num + " "));
        List<Integer> collect2 = list.stream().map(num -> num * 2).collect(Collectors.toList());
        Integer reduce = list
                .stream()
                .map(num -> num * 3)
                .map(num -> num * 2)
                .filter(num -> num % 2 == 0)
                .reduce(0, (c, e) -> c + e);

        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect2);
        System.out.println(reduce);
    }
}
