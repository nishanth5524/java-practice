package Collection;

import java.util.HashSet;

public class HashSet_Demo {

	public static void main(String args[]) {

		HashSet<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(6);
		set.add(3);
		set.add(6);

		for (Integer l : set) {
			System.out.println(l);
		}
	}
}
