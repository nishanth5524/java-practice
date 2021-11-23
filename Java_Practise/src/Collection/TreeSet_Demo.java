package Collection;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSet_Demo {

	public static void main(String args[]) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(6);
		set.add(6);
		set.add(3);
		set.add(4);
		System.out.println(set.ceiling(4));
		System.out.println(set.floor(3));
		
		NavigableSet i = set.descendingSet();
		Iterator<Integer> iterator = i.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Value : " + iterator.next());
		}

		
		
	}

}
