package interfaces.functional;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.function.Supplier;

class SupplierImpl implements Supplier<LocalDateTime> {

    @Override
    public LocalDateTime get() {
        return LocalDateTime.now();
    }
}


public class SupplierDemo {
    public static void main(String[] args) {
        SupplierImpl supplier = new SupplierImpl();
        LocalDateTime localDateTime = supplier.get();
        System.out.println(localDateTime);

        Supplier<LocalTime> supp = () -> LocalTime.now();
        System.out.println(supp.get());
    }
}
