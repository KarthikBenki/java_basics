package oops.generics;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(10, 20);
        System.out.println(p.getFirst() + " " + p.getSecond());

        Pair<String> stringPair = new Pair<>("Karthik", "Benki");
        System.out.println(stringPair.getFirst() + " " + stringPair.getSecond());

        Pair<Double> doublePair = new Pair<>(3.14, 1.23);
        System.out.println(doublePair.getFirst() + " " + doublePair.getSecond());
    }
}
