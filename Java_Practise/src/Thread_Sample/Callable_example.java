package Thread_Sample;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Callable_example {

    public static void main(String[] args) {
              
          Callable<String> task1 = new Callable<String>() {
              
              public String call() throws Exception {
                  return "Done!";
              }
          };
       
          
          ExecutorService es=Executors.newSingleThreadExecutor();
          Future<String> F = es.submit(task1);
          
          if(F.isDone())
          {
              try {
                  System.out.println(F.get());
              } catch (InterruptedException | ExecutionException ex) {
                  System.out.println(ex);
              }
          }
          
          else
          {
              System.out.println("Error");
          }
          
          es.shutdown();
          
    }
    
}
