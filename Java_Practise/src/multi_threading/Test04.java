package multi_threading;

class ChildThread extends Thread
{
	public void run(){
	System.out.println(Thread.currentThread().getName());
    }
}

public class Test04 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		ChildThread obj = new ChildThread();
		
		obj.start();
		
	}
	
}
