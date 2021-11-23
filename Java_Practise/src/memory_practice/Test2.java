package memory_practice;

class Student02
{
	private String name;
	private int rollno;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
	
	 Student02 obj1 = new Student02();	
	 Student02 obj2 = new Student02();
	 
	 Class c1 = obj1.getClass();
	 Class c2 = obj2.getClass();
	 
	 Object o1 = obj1.getClass();
	 Object o2 = obj2.getClass();
	 
	 System.out.println(c1.getName());
	 System.out.println(c2.getName());
	
	 System.out.println(o1.getClass());
	 System.out.println(o2.getClass());
	 
	 System.out.println(c1==c2);
	 
	}
	
	
}
