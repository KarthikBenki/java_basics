package interfaces.functional;

import java.util.function.Supplier;

class SupplierImpl implements Supplier<String> {

    @Override
    public String get() {
        return "Hello World";
    }
}


public class SupplierDemo {
    public static void main(String[] args) {
        SupplierImpl supplier = new SupplierImpl();
        String s = supplier.get();
        System.out.println(s);


    }
}
