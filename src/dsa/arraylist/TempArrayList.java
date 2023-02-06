package dsa.arraylist;

import java.util.ArrayList;

public class TempArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("carrot");
        list.add(0, "mango");//adds new data pushes the existing data to next place

        System.out.println(list.get(2));

        list.forEach(a -> System.out.print(a + " "));




    }
}
