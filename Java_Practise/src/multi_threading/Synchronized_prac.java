package multi_threading;

class Display {
	public void wish(String name) {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.print("Good Morning:");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
				}

				System.out.println(name);
			}
		}
	}
}

class MyThread_Display extends Thread {
	Display d;
	String name;

	MyThread_Display(Display d, String name) {
		this.d = d;
		this.name = name;
	}

	public void run() {
		d.wish(name);
	}
}

public class Synchronized_prac {

	public static void main(String[] args) {

		Display d = new Display();
		MyThread_Display t1 = new MyThread_Display(d, "Dhoni");
		MyThread_Display t2 = new MyThread_Display(d, "Yuvraj");
		t1.start();
		t2.start();
	}

}
