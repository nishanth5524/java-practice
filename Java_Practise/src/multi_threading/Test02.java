package multi_threading;

class myRunnable implements Runnable
{

	public void run() {
		
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
		
	}
	
}

public class Test02 {

public static void main(String[] args) {
	
	myRunnable obj = new myRunnable();
	Thread ob = new Thread(obj);
}	
	
}
 