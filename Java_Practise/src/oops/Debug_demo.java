package oops;

class Debug_demo_child extends Thread {
	public void run() {
		System.out.println("run");
	}
}

public class Debug_demo {

	public static void main(String[] args) {

		Debug_demo obj = new Debug_demo();
		obj.a();

	}

	void a() {
		b();
	}

	void b() {
		c();
	}

	void c() {
		d();
	}

	void d() {
		System.out.println("End");
		Thread.currentThread().dumpStack();
		StackTraceElement[] ste = Thread.currentThread().getStackTrace();
		
		for(StackTraceElement v : ste)
		{
			System.out.println(v);
		}
	}

}
