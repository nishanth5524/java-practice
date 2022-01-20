package memory_practice;

import java.util.ArrayList;
import java.util.Vector;

class A extends Thread {

	private static final int ONE_MB = 1024 * 1024;

	@Override
	public void run() {

		ArrayList<byte[]> list = new ArrayList<>();

		for (int i = 0; i < 5; i++) {

			list.add(new byte[50 * ONE_MB]);
			System.out.println("50");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}
}

class B extends Thread {

	private static final int ONE_MB = 1024 * 1024;

	@Override
	public void run() {

		Vector<byte[]> v = new Vector<>();

		for (int i = 0; i < 5; i++) {

			v.add(new byte[20 * ONE_MB]);
			System.out.println(20);
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}

	}

}

public class MAT {

	public static void main(String[] args) throws InterruptedException {

		A t1 = new A();
		t1.start();

		B t2 = new B();
		t2.start();

		int ONE_MB = 1024 * 1024;

		Vector<byte[]> v = new Vector<>();

		for (int i = 0; i < 5; i++) {

			v.add(new byte[100 * ONE_MB]);
			System.out.println(100);
			Thread.sleep(100000);

		}

	}

}
