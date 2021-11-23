package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MyThread3 implements Runnable {

	private List<Integer> myList;

	public MyThread3(List<Integer> list) {
		this.myList = list;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			updateList(i);
		}
		System.out.println("end: " + myList.size());
	}
	
	private void updateList(int i) {
		myList.add(i);
	}
}

public class ALSync {

	public static void main(String[] args) {

		ArrayList<Integer> taskList = new ArrayList<Integer>();
        Object obj = new Object();
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		executorService.execute(new MyThread3(taskList));
		executorService.execute(new MyThread3(taskList));

		executorService.shutdown();

	}

}
