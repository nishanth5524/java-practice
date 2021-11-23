
package innerclass;

public class Static {

    public static void main(String args[])
    {
        a.b obj = new a.b();
        obj.print();
    }
}

class a
{
    static class b
    {
        void print()
        {
            System.out.println("Hi :-)");
        }
    }
}