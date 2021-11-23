
package Thread_Sample;

public class DeadLock {
 
    public static void main(String[] args) {
        
        Object ob1 = new Object();
        Object ob2 = new Object();
        
        D_Thread01 t1 = new D_Thread01(ob1,ob2); 
        t1.start();
        D_Thread02 t2 = new D_Thread02(ob1,ob2); 
        t2.start();
    }
    
    
    
}
