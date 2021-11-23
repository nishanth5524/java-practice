package multi_threading;


class Display_Demo
{
	public synchronized void displayn()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}
	
	public synchronized void displayc()
	{
		for(int i=65;i<=75;i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(2000);
			}catch(InterruptedException e){}
		}
	}

}

class Thread_Display_1 extends Thread
{  
	Display_Demo d;
	
	 Thread_Display_1(Display_Demo d)
	 {
		 this.d=d;
	 }
	
		
	public void run()
	{
	  d.displayc();	
	}
}

class Thread_Display_2 extends Thread
{  
	Display_Demo d;
	
	 Thread_Display_2(Display_Demo d)
	 {
		 this.d=d;
	 }
	
		
	public void run()
	{
	  d.displayn();	
	}
}
public class Synchronized_prac_02 {

	public static void main(String[] args) {
		
	Display_Demo obj = new Display_Demo();
	
	Thread_Display_1 t1 = new Thread_Display_1(obj);
	Thread_Display_2 t2 = new Thread_Display_2(obj);
    t1.start();
    t2.start();
	}
}
