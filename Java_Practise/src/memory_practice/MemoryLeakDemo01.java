package memory_practice;

import java.util.ArrayList;
import java.util.List;

public class MemoryLeakDemo01 {
	public List<Double> list = new ArrayList<>();

	public void populateList() throws InterruptedException {
		for (int i = 0; i < 10000000; i++) {
			list.add(Math.random());
			Thread.sleep(1);
		}

	}

	public static void main(String[] args) throws InterruptedException {
		new MemoryLeakDemo01().populateList();
		System.out.println("End of Program!");

	}
} 
