package Thread_Sample;

public class Runnable_Main_TheadPool implements Runnable {

    public void run() {

        
        System.out.println("Start Thread....."+Thread.currentThread().getName());
        
        try {   Thread.sleep(1000); } catch (Exception e) {  }
        
        System.out.println("End Thread....."+Thread.currentThread().getName());

    }

}
