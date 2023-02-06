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

        //generics of multiple types

        Pair1<String, Integer> pair1 = new Pair1<>("one", 1);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());

        //chained generics method

        Pair1<String, Integer> innerPair = new Pair1<>("one", 1);
        Pair1<Pair1<String, Integer>, String> pp = new Pair1<>(innerPair, "one");
        System.out.println(pp.getFirst() + " " + pp.getSecond());

        System.out.println(pp.getSecond());

        Pair1<String, Integer> first = pp.getFirst();

        System.out.println(first.getFirst()+" "+" both are same  "+innerPair.getFirst());

        System.out.println(innerPair+" "+first);

        String first1 = pp.getFirst().getFirst();
        System.out.println(first1+ "  in inner pair");

        Integer second = pp.getFirst().getSecond();
        System.out.println(second +" in inner pair");


    }
}
