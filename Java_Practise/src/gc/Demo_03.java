package gc;

import java.util.Date;

public class Demo_03 {

	public static void main(String[] args) throws Exception {

		long beforeUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		Date[] arr = new Date[100000000];

		for (int i = 0; i < 1000000; i++) {
			arr[i] = new Date();
			//Thread.sleep(1);

			if (i % 2 == 0)
				arr[i] = null;
		}

		long afterUsedMem = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

		long actualMemUsed = afterUsedMem - beforeUsedMem;

		System.out.println(actualMemUsed/1024/1024 + "mb");

		System.out.println("End of main");
	}
}
