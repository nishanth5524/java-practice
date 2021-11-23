 package multi_threading;

class Pri_prac_02 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println("Child Thread");
	}
}

public class Prio_prac_02 {

	public static void main(String[] args) {
		
		Pri_prac_02 t = new Pri_prac_02();
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<10;i++)
			System.out.println("Main Thread");
	}
	
}
