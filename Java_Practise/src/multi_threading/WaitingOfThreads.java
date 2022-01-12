package multi_threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Thread_project.Loan;

class Dummy implements Runnable {

	int i;

	@Override
	public void run() {

		try {
			
			System.out.println(Thread.currentThread().getName()+" Entered into sleep");
			Thread.sleep(100000);
			System.out.println(Thread.currentThread().getName()+" Exiting from sleep");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

public class WaitingOfThreads {

	public static void main(String[] args) {

		System.out.println(Runtime.getRuntime().availableProcessors());

		ExecutorService es = Executors.newFixedThreadPool(30);
		
		for (int i = 1; i <= 50; i++) {

			Runnable obj = new Dummy();
		//	System.out.println(Thread.activeCount());
			es.execute(obj);

		}

		System.out.println("End of Main");

		es.shutdown();

	}

}
