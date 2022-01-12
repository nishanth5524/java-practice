package memory_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GCoverhead{

	public static void main(String args[]) throws Exception

	{

		Map m = new HashMap();

		m = System.getProperties();

		Random r = new Random();

		while (true) {

			int k = r.nextInt();
			m.put(k, "randomValue");
			m.remove(k);
			m.put(k, "randomValue");
			
			Thread.sleep(1);

		}

	}

}
