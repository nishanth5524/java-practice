package Thread_Sample;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadPool {

    public static void main(String[] args) {
        
        ExecutorService es = Executors.newFixedThreadPool(3);

        for(int i=1;i<=10;i++)
        {
            Runnable runnable = new MyRunnable("My worker Thread:" + i);
            
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                
            }
            
            es.execute(runnable);
        }
        
        
        es.shutdown();
        
        while(!es.isTerminated()){}
        System.out.println("All request are completed");
        
    }

    
}
