package memory_practice;

//class Child1 extends Thread
//{
//	public void run()
//	{
//		ThreadLocal<Number> obj = new ThreadLocal<Number>();
//		obj.set(100);
//		System.out.println("Child1");
//	}
//}

class Child2 extends Thread {
	public void run() {
		ThreadLocal<String> obj2 = new ThreadLocal<String>();
		obj2.set("Demo");
		obj2.remove();
		
		System.out.println(obj2.get());

		if (Thread.currentThread().getName().equals("Demo")) {
			System.out.println("Demo");
			obj2.set("Dummy");
		}
		
		else
		{
			System.out.println("Else condition");
		}

	}
}

public class ThreadLocalDemo {

	public static void main(String[] args) throws InterruptedException {

//		obj.set(100);
//
//		System.out.println("value = " + obj.get());
//
//		obj2.set("GeeksforGeeks");
//
//		System.out.println("value = " + obj2.get());
//	

		Child2 t1 = new Child2();
		Child2 t2 = new Child2();

		t1.setName("Demo");

		t1.start();

		t2.start();
		
		

	}

}
