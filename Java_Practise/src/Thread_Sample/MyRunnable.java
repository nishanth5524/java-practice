package Thread_Sample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyRunnable implements Runnable{

    private String name;
    
    public MyRunnable(String name)
    {
        this.name = name;
    }
    
    public synchronized void run()
    {
        System.out.println("Start Thread : "+name);
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
         System.out.println("End Thread : "+name);
    }
    
    
}
