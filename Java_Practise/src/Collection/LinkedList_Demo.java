package Collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String args[]) {
		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.addFirst(6);
		list.addLast(7);

//		 Collections.sort(list);
//		list.forEach((n) -> System.out.println(n));
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.get(2));
//		list.removeLastOccurrence(1);
//		list.removeFirstOccurrence(1);
//		System.out.println(list.peek());
//		System.out.println(list.peekFirst());
//		System.out.println(list.peekLast());
//		System.out.println(list.poll());
//		System.out.println(list.pollFirst());
//		System.out.println(list.pollLast());
//		System.out.println(list.pop());
//		list.push(1);

//		System.out.println();
//
//		Iterator i = list.iterator();
//
//		while (i.hasNext())
//			System.out.println(i.next());

//		Iterator x = list.descendingIterator();
//
//		while (x.hasNext()) {
//			System.out.println("Value is : " + x.next());
//		}

//		while (list.poll() != null) {
//			System.out.println(list.peek());
//		}

	}
}
