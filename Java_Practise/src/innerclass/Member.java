package innerclass;

public class Member {
    
    public static void main(String args[])
    {
        A obj = new A();
        A.B obj1= obj.new B();
        obj1.print();
    }
    
}

class A
{
    class B
    {
        void print()
        {
            System.out.println("Hello :-)");
        }
    }
}
