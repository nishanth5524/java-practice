package multi_threading;

class Pri_prac extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("Child Thread");
	}
}

public class Priority_prac {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(17);
		Thread.currentThread().setPriority(8);
		Pri_prac t = new Pri_prac();
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t.currentThread().getPriority());
		
		
	}
	
	
}
