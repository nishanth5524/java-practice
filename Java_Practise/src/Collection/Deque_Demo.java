package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_Demo {
	public static void main(String[] args) {

		Deque<Integer> deque = new ArrayDeque<Integer>();
		deque.add(1);
		deque.add(2);
		deque.add(3);

		deque.addFirst(6);

		deque.addLast(7);

		for (Integer i : deque) {
			System.out.println(i);
		}
		
		deque.pop();
		
		
		System.out.println();

		for (Integer i : deque) {
			System.out.println(i);
		}
	}
}
