package multi_threading;

class MyThread1 implements Runnable {

	
	private boolean exit;

	private String name;
	Thread t;

	MyThread1(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		exit = false;
		t.start(); 
	}

	
	public void run() {
		int i = 0;
		while (!exit) {
			System.out.println(name + ": " + i);
			i++;
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Caught:" + e);
			}
		}
		System.out.println(name + " Stopped.");
	}

	
	public void stop() {
		exit = true;
	}
}


public class Stop {
	public static void main(String args[]) {
	
		MyThread1 t1 = new MyThread1("First thread");
		MyThread1 t2 = new MyThread1("Second thread");
		try {
			Thread.sleep(500);
			t1.stop(); 
			t2.stop(); 
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Caught:" + e);
		}
		System.out.println("Exiting the main Thread");
	}
}
