package memory_practice;

class A extends Thread{

	@Override
	public void run() {

		System.out.println("A");

	}

}

class B extends Thread {

	@Override
	public void run() {

		System.out.println("B");

	}

}

public class MAT {

	public static void main(String[] args) {

		A t1 = new A();
		t1.start();
		
		B t2 = new B();
		t2.start();
		
		int i = 2147483647;
		
		
	}

}
