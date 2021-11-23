
package Thread_Sample;

public class Product {

   int id;
   String pro_name;
   
   public Product(int id,String pro_name)
   {
       this.id=id;
       this.pro_name=pro_name;
   }
   
   public String toStirng()
   {
       return "id: " +id + "name: " + pro_name;
   }
   


    
}
