package fundamentals.streamApi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Object> emptyStream = Stream.empty();//empty method
        String names[] = {
                "Durgesh", "uttam", "Ankit", "Divya"
        };

        Stream<String> names1 = Stream.of(names);
        names1.forEach(n -> System.out.println(n));
        String s = Stream.of(names).max(Comparator.comparingInt(String::length)).get();
        System.out.println(s);

        IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5});
        int sum = stream.reduce(0, (c, e) -> c + e);
        System.out.println(sum);


        HashSet<Integer> integers = new HashSet<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(20);

        System.out.println(integers);

        Set<Integer> collect = integers
                .stream()
                .sorted()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.toSet());

        collect.add(25);
        System.out.println(collect);

        Predicate<Integer> integer =  num -> num > 10;

        integers
                .stream()
                .filter(integer)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        integers.stream().forEach(System.out::print);

        System.out.println();

        Integer integer1 = integers.stream().min((a, b) -> a.compareTo(b)).get();

        System.out.println("min "+ integer1);

        Integer integer2 = integers.stream().max((a, b) -> a.compareTo(b)).get();

        System.out.println("max "+ integer2);


    }
}
