package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Vector_Demo {

	public static void main(String args[]) throws InterruptedException {

		Vector<Integer> v = new Vector<Integer>();

		v.add(1);
		v.add(2);
		v.add(3);

		System.out.println(v.capacity());

		v.trimToSize();

		System.out.println(v.capacity());

	}

}
