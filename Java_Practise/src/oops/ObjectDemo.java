package oops;

class AA {

	public void show()
	{
		System.out.println("A");
	}
	
}

class BB extends AA
{
	public void show()
	{
		System.out.println("A");
	}
	
	public void dummy()
	{
		
	}
		
}

public class ObjectDemo
{
	public static void main(String[] args) {
		
		AA obj1 = new AA();
		obj1.show();
		
		BB obj2 = new BB();
		obj2.show();
		
		AA obj3 = new BB();
		obj3.show();
		
		
	}
}
