package Collection;

import java.util.*;

public class synchronizedListprac {
	public static void main(String[] args) {
		List<String> list = Collections.synchronizedList(new ArrayList<String>());

		list.add("practice");
		list.add("code");
		list.add("quiz");

		synchronized (list) {
			Iterator it = list.iterator();

			while (it.hasNext())
				System.out.println(it.next());
		}
	}
}
