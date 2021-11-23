package oops;

class Thread_prac {
	// @Override
	public void run() {
		System.out.println("Thread_prac Class");
	}

}

class D extends Thread_prac {

//	public void run() {
//		System.out.println("D Class");
//	}
}

public class Override_prac {

	public static void main(String[] args) {

		Thread_prac ob = new Thread_prac();
		ob.run();

		D obj = new D();
		obj.run();
		
		Thread_prac obj1 = new D();
		obj1.run();
		

	}

}
