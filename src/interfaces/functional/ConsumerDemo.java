package interfaces.functional;


import java.util.function.Consumer;

class ConsumerImpl implements Consumer<String> {

    @Override
    public void accept(String string) {
        System.out.println(string);
    }
}


public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<String> consumer = new ConsumerImpl();
        consumer.accept("Hello World");
        Consumer<String> con = s -> System.out.println(s);
        con.accept("Hello ninja");
    }
}
