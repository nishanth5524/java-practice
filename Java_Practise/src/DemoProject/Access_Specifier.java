
package DemoProject;

class A
{
    public int a=10;
    public int b=20;
    public int c=30;
    
    public void show()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    
}

class B extends A
{
     public void print()
    {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class Access_Specifier {

   
    public static void main(String args[])
    {
        B obj = new B();
        obj.print();
        obj.show();
    }
            
}

