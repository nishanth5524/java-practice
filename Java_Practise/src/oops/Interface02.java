package oops;

interface A1
{
	void show();
}

class B1 implements A1
{

	@Override
	public void show() {
		

		System.out.println("Hi");
		
	}
	
}

public class Interface02 {

	public static void main(String[] args) {
		
		A1 obj = new B1();
		
	}
	
	
}
