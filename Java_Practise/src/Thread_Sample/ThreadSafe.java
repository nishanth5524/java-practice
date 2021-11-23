package Thread_Sample;

class Sample implements Runnable {

    int count;

    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            count++;
        }
    }
}

public class ThreadSafe {

    public static void main(String args[]) throws Exception {
        Sample obj = new Sample();

        Thread t1 = new Thread(obj);
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);

    }

}
