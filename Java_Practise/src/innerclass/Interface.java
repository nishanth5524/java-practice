
package innerclass;

public class Interface {
    
    public static void main(String args[])
    {
       Def obj = new Def();   
       
    }
    
}

class Def implements Demo
{
    public void show()
    {
        System.out.println("Hello");
    }
}

interface Demo
{
    void show();
}
