package multi_threading;

class Yield_prac_child extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child");
			Thread.yield();
		}
	}
}

public class Yield_prac {

	public static void main(String[] args){

		Yield_prac_child obj = new Yield_prac_child();
		obj.start();

	    obj.setPriority(1);
		
		for (int i = 0; i < 10; i++)
			System.out.println("Main");

	}

}
