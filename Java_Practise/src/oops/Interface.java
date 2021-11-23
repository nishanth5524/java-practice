package oops;

interface A
{
	void m1();
	void m2();
}

abstract class B implements A
{

	
	public void m1() {
		
		System.out.println("m1");
		
	}

	//abstract void m3();
	
	/*public void m2() {
	
		System.out.println("m2");
	}*/
	
}

class C extends B implements A
{

	public void m2() {
		
		System.out.println("m2");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
	
		C obj = new C();
		obj.m1();
		obj.m2();
		
	}
	
}
