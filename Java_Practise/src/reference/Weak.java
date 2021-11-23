package reference;

import java.lang.ref.WeakReference;

class Demo1 {

	void show() {
		System.out.println("WeakRefernce");
	}
}

public class Weak {

	public static void main(String[] args) {

		Demo1 obj = new Demo1();
		
		WeakReference<Demo1> weak = new WeakReference<Demo1>(obj);

		obj.show();

		obj = null;

		System.gc();
			
		obj = weak.get();

		obj.show();

	}

}
