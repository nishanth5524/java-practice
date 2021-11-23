package memory_practice;

class Student03
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



public class Test3 {
  
	public static void main(String[] args) {
		
		System.out.println(String.class.getClassLoader());
		System.out.println(Student03.class.getClassLoader());
		System.out.println(Test3.class.getClassLoader());
		
	}
	
	
}
