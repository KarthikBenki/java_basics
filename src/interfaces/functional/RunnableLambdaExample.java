package interfaces.functional;

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("run method is called....");
    }
}

public class RunnableLambdaExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        Runnable runnable = ()-> System.out.println("Lambda runnable is called");

        Thread thread1 = new Thread(runnable);
        thread1.start();
    }
}
