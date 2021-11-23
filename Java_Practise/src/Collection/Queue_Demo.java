package Collection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo {

	public static void main(String args[]) {

		Deque<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		q.addFirst(6);
		q.addLast(7);


		
		// System.out.println(q.getFirst());

		for(int i=1;i<=q.size();i++)
		{
			System.out.println(q.getFirst());
			q.removeFirst();
		}
//		
//		try {
//		
//		while (q.getFirst() != null) {
//
//			System.out.println(q.getFirst());
//			q.removeFirst();
//
//		}
//
//		}
//		catch(Exception ex) {
//			System.out.println(ex);
//		}
////		System.out.println("Peek: " + q.peek());
//
//		for (Integer l : q) {
//			System.out.println(l);
//		}
	}
}
