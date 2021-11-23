package Thread_Sample;

class Sample01 implements Runnable {

    static int count;

    public static synchronized void increment()
    {
        System.out.println(Thread.currentThread().getName());
            count++;
    }
    
    public void run() {
        for (int i = 0; i < 100; i++) {
            increment();
        }
    }
}

public class Lock {

    public static void main(String args[]) throws Exception {
        Sample01 obj1 = new Sample01();
        Sample01 obj2 = new Sample01();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj1.count+obj2.count);

    }

}
