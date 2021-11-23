package Collection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import Thread_project.Loan;

public class ArrayList_Demo {

	static int getCapacity(List al) throws Exception {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		return ((Object[]) field.get(al)).length;
	}

	public static void main(String args[]) throws Exception {

		ArrayList<Integer> l1 = new ArrayList();

		l1.add(1);
		l1.add(2);
		l1.add(3);

		System.out.println(l1);

		ArrayList<Integer> l2 = new ArrayList();

		l2.add(111);
		l2.add(222);
		l2.add(333);

		System.out.println(l2);

//	l1.addAll(2,l2);

//	System.out.println(l1);
//		
//		l2.clear();
//		System.out.println(l2);
//		
//		ArrayList<Integer> clonelist = (ArrayList<Integer>)l1.clone();
//		
//
//		System.out.println(clonelist);
//
//		System.out.println(l1.contains(1));

//	    System.out.println(l1.containsAll(l2));

//		System.out.println(l1.equals(l2));

//		l1.forEach((n) -> System.out.println(n));

//		System.out.println(l1.indexOf(2));

//	    System.out.println(l1.getClass());
//		

//		System.out.println(l1.indexOf(3));

		ArrayList<Integer> l3 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(l3);
	
		l3.removeIf(num -> num % 2 == 1);
		System.out.println(l3);

//
		Comparator<Integer> com =(o1, o2) ->{
			
			return o1%10<o2%10?1:-1;
			
		};
//		
		l1.sort(com);
//		
//		System.out.println(l1);
//		
//		System.out.println(l3.lastIndexOf(4));
//		
//		l1.remove(1);
//		System.out.println(l1);
//		

//      l1.retainAll(Collections.singletonList(1));
//    	System.out.println(l1);
//		
//		Object arr[] = l3.toArray();
//		
//		for(Object o : arr)
//		{
//			System.out.println(o);
//		}

//		l1.trimToSize();

	Spliterator<Integer> obj = l1.spliterator();
	obj.forEachRemaining((n) -> System.out.println(n));
	}
}
