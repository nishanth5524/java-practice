package Collection;

//Java Program to illustrate the Treemap Class
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		map.computeIfAbsent("key5", k -> 2000 + 33000);

		map.computeIfPresent("vishal", (key, val) -> val + 100);

		System.out.println(map.containsKey("vishal"));

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}
