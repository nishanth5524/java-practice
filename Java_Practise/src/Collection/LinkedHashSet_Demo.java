package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_Demo {

	public static void main(String args[]) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(1);
		set.add(6);
		set.add(3);
		set.add(6);

		for (Integer l : set) {
			System.out.println(l);
		}
	}

}
