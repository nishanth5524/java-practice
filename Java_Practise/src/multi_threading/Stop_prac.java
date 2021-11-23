package multi_threading;

class Stop_prac_child extends Thread {

	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Iam Lazy Thread");
				/*
				 * 
				 * Doing Some work
				 * 
				 */
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {

			System.out.println("I got Interrupted");

		}
	}

}

public class Stop_prac {

	public static void main(String[] args) throws InterruptedException {

		Stop_prac_child obj = new Stop_prac_child();

		obj.start();

		Thread.sleep(500);

		//obj.stop();
		obj.interrupt();

	}
}
