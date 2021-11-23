package Collection;

import java.util.Stack;

public class Stack_Demo {

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();

		// System.out.println(stack.capacity());

		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(5);

//		System.out.println(stack.peek());
//		System.out.println(stack.peek());
//		System.out.println(stack.size());

//		while (stack.size() != 0) {
//			System.out.println(stack.peek());
//			stack.pop();
//		}
//
//		System.out.println(stack);
//
		for (Integer l : stack) {
			System.out.println(l);
		}
	}
}
