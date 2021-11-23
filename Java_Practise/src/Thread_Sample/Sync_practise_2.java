package Thread_Sample;

public class Sync_practise_2 {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 1000; i++) {
                    count++;
                }
            }

        });

        Thread t2 = new Thread(new Runnable() {

            public void run() {
                for (int i = 0; i < 1000; i++) {
                    synchronized(this)
                    {
                    count++;
                    }
                }
            }

        });

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

       System.out.println("count value : " + count);

    }

}
