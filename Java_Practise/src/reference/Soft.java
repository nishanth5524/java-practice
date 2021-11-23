package reference;

import java.lang.ref.SoftReference;

class Demo2 {

	void show() {
		System.out.println("SoftRefernce");
	}
}

public class Soft {

	public static void main(String[] args) {

		Demo2 obj = new Demo2();

		SoftReference<Demo2> soft = new SoftReference<Demo2>(obj);

		obj.show();

		obj = null;

		System.gc();

		obj = soft.get();

		obj.show();

	}

}
