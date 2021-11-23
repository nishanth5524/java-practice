
package Thread_Sample;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.CopyOnWriteArrayList;

public class Inventory {
    
    List<Product> list = new Vector<Product>();
    
    public void addProduct()
    {
        for(int i=1;i<=100;i++)
        {
            Product product = new Product(i, "test_product_"+i);
            list.add(product);
            System.out.println("Added: "+ product.toStirng());
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                
            }
        }
    }
    
    public void saleProduct()
    {
        
        for(Product product : list)
        {
            System.out.println("Sold Product: "+ product.toStirng());
            
            try {
                Thread.sleep(100);
            } catch (Exception ex) {
                
            }
        }
        
        
        
    }
}
