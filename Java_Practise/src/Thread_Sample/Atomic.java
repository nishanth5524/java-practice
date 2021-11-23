
package Thread_Sample;

import java.util.concurrent.atomic.AtomicInteger;


public class Atomic {

    static AtomicInteger c = new AtomicInteger();
    
  
    public static void main(String[] args) {
        
        
       c.set(50);
       
        System.out.println(c.get());
        
    }

    
}
