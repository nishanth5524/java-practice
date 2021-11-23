package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread4 implements Runnable {

	private Vector<Integer> v;

	public MyThread4(Vector<Integer> v) {
		this.v = v;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			updateVector(i);
		}
		System.out.println("end: " + v.size());
	}
	
	private void updateVector(int i) {
		v.add(i);
	}
}

public class VSync {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
        		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new MyThread4(v));
		executorService.execute(new MyThread4(v));

		executorService.shutdown();

	}

}
