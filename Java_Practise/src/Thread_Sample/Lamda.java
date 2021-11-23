package Thread_Sample;

public class Lamda {

    public static void main(String args[]) throws Exception{

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");

                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello");

                try { Thread.sleep(1000); } catch (Exception e) {}
            }
        });

        th1.start();
        
        try { Thread.sleep(5); } catch (Exception e) { }
        
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println("Bye");
    }
}
