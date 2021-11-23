package Collection;

import java.util.Vector;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread2 implements Runnable {

	private List<Integer> v;

	public MyThread2(List<Integer> list) {
		this.v = list;
	}

	private void updateList(int i) {
		v.add(i);

	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			updateList(i);
		}
		System.out.println("end: " + v.size());
	}
}

public class VectorMyExecutors {

	private Vector<Integer> taskList = new Vector<Integer>();

	private void launch() {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new MyThread2(taskList));
		executorService.execute(new MyThread2(taskList));

		executorService.shutdown();
	}

	public static void main(String[] args) {
		VectorMyExecutors test = new VectorMyExecutors();
		test.launch();
	}
}