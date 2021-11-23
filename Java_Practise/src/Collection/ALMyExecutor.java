package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread implements Runnable {

	private List<Integer> myList;
	private Object host;

	public MyThread(List<Integer> list) {
		this.myList = list;
	}

	private void updateList(int i) {
		myList.add(i);
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			updateList(i);
		}
		System.out.println("end: " + myList.size());
	}
}

public class ALMyExecutor {

	private ArrayList<Integer> taskList = new ArrayList<Integer>();
	private Object object = new Object();

	private void launch() {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new MyThread(taskList));
		executorService.execute(new MyThread(taskList));

		executorService.shutdown();
	}

	public static void main(String[] args) {
		ALMyExecutor test = new ALMyExecutor();
		test.launch();
	}
}
