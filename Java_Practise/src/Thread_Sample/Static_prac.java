package Thread_Sample;

import java.util.logging.Level;
import java.util.logging.Logger;

class Table {

    synchronized static void printTable() {
  
        System.out.println(Thread.currentThread().getName());
       
        for(int i=1;i<=5;i++)
        {
            System.out.println(Thread.currentThread().getName()+ " Running");
            try { Thread.sleep(400);
            } catch (Exception ex) { }
        }
        
    }

}

class MyThread1 extends Thread
{
    public void run()
    {
       Table ob = new Table();
       ob.printTable();
    // Table.printTable();
    }
}

class MyThread2 extends Thread
{
    public void run()
    {
        Table ob = new Table();
        ob.printTable();
       //Table.printTable();
    }
}

public class Static_prac {
      
        public static void main(String[] args) {
        
            MyThread1 t1 = new MyThread1();
            MyThread1 t2 = new MyThread1();
            
            t1.start();
            t2.start();
            
    }
}
