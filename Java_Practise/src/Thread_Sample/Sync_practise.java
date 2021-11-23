package Thread_Sample;

class Sync {

    int count = 0;

    public synchronized void increamet() {
        count++;
    }
}

public class Sync_practise {

    public static void main(String args[]) throws Exception {
        Sync obj = new Sync();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increamet();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    obj.increamet();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(obj.count);

    }

}
