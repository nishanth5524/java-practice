package gc;

import java.util.ArrayList;

public class BreakMyJVM {

	private String value;

	static int i = 10;
	
	public BreakMyJVM(String value) {
		this.value = value;
	}

	public static void main(String[] args) throws InterruptedException {

		ArrayList<BreakMyJVM> l = new ArrayList();

		for (int i = 1;; i++) {

			Thread.sleep(1000);

			for (int j = 1; j < 10000; j++) {

				l.add(new BreakMyJVM("val" + i + j));
			}
		}

	}
}
