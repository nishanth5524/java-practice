package multi_threading;


class Join_prac_02_child extends Thread
{
	static Thread mt;
	
	public void run()
	{
		try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			
		}
		
	}
}

public class Join_prac_02 {

	public static void main(String[] args) throws InterruptedException {
		
		Join_prac_02_child.mt=Thread.currentThread();
		
		Join_prac_02_child obj = new Join_prac_02_child();
		obj.start();
				
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
			
			Thread.sleep(1000);
		}
		
		
	}
	
}
