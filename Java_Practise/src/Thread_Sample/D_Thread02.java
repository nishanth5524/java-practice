
package Thread_Sample;

import java.util.logging.Level;
import java.util.logging.Logger;

public class D_Thread02 extends Thread{
    
    private Object ob1;
    private Object ob2;
    
    public D_Thread02(Object ob1,Object ob2)
    {
        this.ob1=ob1;
        this.ob2=ob2;
    }
    
    public void run()
    { synchronized (ob2) {

            System.out.println("Acquire lock on object 2 Waiting for Object 1");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }

            synchronized (ob1) {
                System.out.println("Acquire lock on object 2 and Object 1");
            }

        }
    }
    
    
}
