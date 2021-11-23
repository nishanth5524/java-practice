package multi_threading;

class Join_prac_child extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Seetha Thread");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Join_prac {

	public static void main(String[] args) throws InterruptedException {
		
		Join_prac_child obj = new Join_prac_child();
		
		obj.start();
		obj.join(10000);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Rama Thread");
		}
	}
}
