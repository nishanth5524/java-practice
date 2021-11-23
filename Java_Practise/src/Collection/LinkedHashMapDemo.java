package Collection;

//Java Program to illustrate the LinkedHashmap Class
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();

		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		Map<String, Integer> map2 = new LinkedHashMap<>();

		map.put("ram", 10);
		map.put("mani", 30);
		map.put("vaibhav", 20);

	//	map.compute("vishal", (key, val) -> 100);

		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println(e.getKey() + " " + e.getValue());
	}
}
