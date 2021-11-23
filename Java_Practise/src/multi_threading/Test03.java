package multi_threading;

class MyThread extends Thread
{
	
}

public class Test03 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
	    MyThread t = new MyThread();
	    System.out.println(t.getName());
		Thread.currentThread().setName("Nishanth");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);
	}
	
}
