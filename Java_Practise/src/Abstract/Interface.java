
package Abstract;

interface vehicle
{
    public static final int a = 10;
    void start();
}


class bike implements vehicle
{
    public void start() {
      
    System.out.println("bike");
}
}

class car implements vehicle
{
    public void start() {
      
    System.out.println("car");
    }

}

public class Interface {
    
    public static void main(String[] args) {
        vehicle obj1 = new car();
        vehicle obj2 = new bike();
        
        obj1.start();
        obj2.start();
        
        System.out.println("a = "+ vehicle.a);
       // vehicle.n=11;
    }
    
}
