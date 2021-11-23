package oops;

interface abc {
	int a=10;
	void show(int i,int j,int a);
}

// class xyz implements abc
// {
//
// public void show() {
//
// System.out.println("Hello");
//
// }
//
// }

public class LamdaPrac {

	public static void main(String[] args) {

		// abc obj;
		// obj = new xyz();

		abc obj;

		obj = (i,j,a) -> 
		{
			System.out.println("Hello" + i + j + a);
			
		};

		//abc.a = 11;
		System.out.println(obj.a);
		obj.show(5,6,9);
	}

}
