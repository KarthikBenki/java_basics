package oops.dynamicarray;

public class DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray d = new DynamicArray();
        d.add(10);
        d.add(10);
        System.out.println(d.size());
        d.print();
//        d.removeLast();
        System.out.println();
        d.print();
        d.get(2);
    }
}
