package Thread_Sample;

class A extends Thread {

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

class B extends Thread{

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

public class ThreadSample {

    public static void main(String args[]) throws Exception {
        
        Runtime r = Runtime.getRuntime();
        A obj1 = new A();
        B obj2 = new B();
        if(obj1.isDaemon())
            System.out.println("Is Daemon");
        obj1.start();
        try {
            Thread.sleep(1);
        } catch (Exception e) {
        }
        obj2.start();
        
        obj1.join();
        obj2.join();
        System.out.println("Thank you:");
    }

}
