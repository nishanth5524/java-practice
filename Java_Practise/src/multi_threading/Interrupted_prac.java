package multi_threading;

class Interrupted_prac_child extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Iam Lazy Thread");
				/*
				 * 
				 * Doing Some work
				 * 
				 */
				Thread.sleep(20000);
			}
		} catch (InterruptedException e) {

			System.out.println("I got Interrupted");

		}

	}

}

public class Interrupted_prac {

	public static void main(String[] args) throws InterruptedException {

		Interrupted_prac_child obj = new Interrupted_prac_child();

		obj.start();
		Thread.sleep(2000);
		obj.interrupt();

	}

}
