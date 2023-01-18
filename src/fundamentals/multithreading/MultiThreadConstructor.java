package fundamentals.multithreading;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thank you");
//        while (true) {
//            System.out.println("I am a thread");
//        }
    }
}

public class MultiThreadConstructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("karthi");
        MyThr t2 = new MyThr("Ram chandar");
        t1.start();
        t2.start();
        System.out.println("the id of thread is " + t2.getId());
        System.out.println("the name of thread is " + t2.getName());
        System.out.println("the id of thread is " + t1.getId());
        System.out.println("the name of thread is " + t1.getName());
    }
}
