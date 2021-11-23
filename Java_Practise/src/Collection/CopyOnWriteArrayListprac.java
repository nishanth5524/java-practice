package Collection;
import java.io.*;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListprac
{
	public static void main (String[] args)
	{
		CopyOnWriteArrayList<String> threadSafeList
			= new CopyOnWriteArrayList<String>();

		threadSafeList.add("geek");
		threadSafeList.add("code");
		threadSafeList.add("practice");

		System.out.println("Elements of synchronized ArrayList :");

		Iterator<String> it = threadSafeList.iterator();

		while (it.hasNext())
			System.out.println(it.next());
	}
}
