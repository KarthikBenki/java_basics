package fundamentals.multithreading;


class ThreadRunnable1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I am a thread 1 not a threat 1");
        }
    }
}

class ThreadRunnable2 implements Runnable {

    @Override
    public void run() {
        while (true) {
            System.out.println("I am a thread 2 not a threat 2");
        }
    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {
        ThreadRunnable1 bullet1 = new ThreadRunnable1();
        Thread gun1 = new Thread(bullet1);
        ThreadRunnable2 bullet2 = new ThreadRunnable2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
    }
}
