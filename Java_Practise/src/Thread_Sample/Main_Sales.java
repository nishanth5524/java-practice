
package Thread_Sample;


public class Main_Sales {
    
    public static void main(String[] args) throws Exception {
       
        Inventory obj = new Inventory();
        
        Thread t1 = new Thread (new Runnable()
        {
            
            public void run() {
                obj.addProduct();
            }
            
        });
        
        Thread t2 = new Thread (new Runnable()
        {
            
            public void run() {
                obj.saleProduct();
            }
            
        });
        
        t1.start();
        Thread.sleep(2000);
        t2.start();
        
        
    }
    
    
}
