package multi_threading;

class Demo extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println("Run Method");
		}
	}
		
}

public class Test {

	public static void main(String[] args) {
		
	
	    Demo obj = new Demo();
		obj.start();
	    
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Method");
		}
	}
	
}
