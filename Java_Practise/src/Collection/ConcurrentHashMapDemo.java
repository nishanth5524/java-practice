package Collection;

import java.util.concurrent.*;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> m = new ConcurrentHashMap<>();

		m.put(100, "Hello");
		m.put(101, "Geeks");
		m.put(102, "Geeks");

		m.putIfAbsent(101, "Hello");

		m.putIfAbsent(103, "Hello");

		m.replace(101, "Geeks", "For");
		System.out.println(m);
	}
}
