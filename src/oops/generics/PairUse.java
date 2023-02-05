package oops.generics;

import oops.interfaces.Vehicle;

public class PairUse {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(10, 20);
        System.out.println(p.getFirst() + " " + p.getSecond());

        Pair<String> stringPair = new Pair<>("Karthik", "Benki");
        System.out.println(stringPair.getFirst() + " " + stringPair.getSecond());

        Pair<Double> doublePair = new Pair<>(3.14, 1.23);
        System.out.println(doublePair.getFirst() + " " + doublePair.getSecond());

        Pair<Vehicle> vehiclePair = new Pair<>(new Vehicle(), new Vehicle());
        System.out.println(vehiclePair.getFirst() + " " + vehiclePair.getSecond());

    }
}
