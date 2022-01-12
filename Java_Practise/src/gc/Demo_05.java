package gc;

import java.util.ArrayList;

public class Demo_05 {

	private static final int ONE_MB = 1024 * 1024;

	public static void main(String args[]) throws InterruptedException {

		ArrayList<byte[]> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			list.add(new byte[50*ONE_MB]);

			System.out.println(list.get(i));
			
			Thread.sleep(1);
            
			 
		}

	}

}
