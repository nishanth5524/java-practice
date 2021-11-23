
package Abstract;

abstract class vehicle01
{
    static int n = 10;
    abstract void start();
}


class bike01 extends vehicle01
{
    public void start() {
      
    System.out.println("bike");
}
}

class car01 extends vehicle01
{
    public void start() {
      
    System.out.println("car");
    }

}

public class Abstract_practise {
    
    public static void main(String[] args) {
        vehicle01 obj1 = new car01();
        vehicle01 obj2 = new bike01();
        
        obj1.start();
        obj2.start();
        
        obj1.n=11;

        System.out.println("n = "+obj1.n);        
        
    }
    
}
