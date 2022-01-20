package gc;

import java.util.ArrayList;

public class Demo_05 {

	private static final int ONE_MB = 1024 * 1024;

	public static void main(String args[]) throws InterruptedException {

		ArrayList<byte[]> list = new ArrayList<>(5000);

		for (int i = 0; i < 5000000; i++) {

			list.add(new byte[ONE_MB]);

			Thread.sleep(100);
            
			 
		}

	}

}
