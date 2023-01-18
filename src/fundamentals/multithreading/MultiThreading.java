package fundamentals.multithreading;


class MyThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("my cooking thread1 is running i am happy");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("my thread2 is good i am sad");
            i++;
        }
    }
}

class MyThread3 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            i++;
            System.out.println("i am in thread 3 running");
        }
    }
}

class MyThread4 implements Runnable {

    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            i++;
            System.out.println("i am in thread 4 not running");
        }
    }
}


public class MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

//        MyThread3 t3 = new MyThread3();
//        MyThread4 t4 = new MyThread4();
//        t3.run();
//        t4.run();
    }
}
