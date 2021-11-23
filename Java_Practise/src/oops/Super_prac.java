package oops;

//Java code to demonstrate super()

/* superclass Person */
interface Human
{
	void m();
}

class Person {
	Person()
	{
		System.out.println("Person class Constructor");
	}
}

/* subclass Student extending the Person class */
class Student extends Person implements Human{
	Student()
	{
		// invoke or call parent class constructor
	//	super();

		System.out.println("Student class Constructor");
	}

	@Override
	public void m() {
		// TODO Auto-generated method stub
		
	}
}

public class Super_prac {

	public static void main(String[] args)
	{
		Student s = new Student();
	}
}
