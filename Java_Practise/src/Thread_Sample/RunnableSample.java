package Thread_Sample;

class hi implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {

            System.out.println("hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class hello implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class RunnableSample {

    public static void main(String args[]) {
        hi obj1 = new hi();
        hello obj2 = new hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        t2.start();
    }

}
