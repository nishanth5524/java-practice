
package Thread_Sample ;


public class ObjectPrac extends Atomic {
    
     static void show()
        {
            int n;
        }
     
      void printClassName(Object obj) {
         System.out.println("The class of " + obj +
                            " is " + obj.getClass().getName());
     }
      
      
    
    public static void main(String[] args) {
        
    //    System.out.println(ObjectPrac.class);
        
        Object obj1 = new Object();
        Object obj2 = new Object();
        ObjectPrac mobj = new ObjectPrac();
        mobj.printClassName(obj1);
    }
    
}
