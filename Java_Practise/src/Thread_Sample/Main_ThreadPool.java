package Thread_Sample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_ThreadPool {

     public static void main(String[] args) {
        
         ExecutorService es = Executors.newFixedThreadPool(5);
         
         for(int i=1;i<=10;i++)
         {
             Runnable obj = new Runnable_Main_TheadPool();
             es.execute(obj);
         }
         
        es.shutdown();
         
    }


   
    
}
