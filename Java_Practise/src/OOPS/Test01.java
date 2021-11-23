
package OOPS;

import java.lang.reflect.*;

class Student01
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



public class Test01 {

	public static void main(String[] args) {
		
		Student01 s = new Student01();
		Class c = s.getClass();
		
		System.out.println(c.getName());
		
		Method[] m = c.getDeclaredMethods();
				
		System.out.println("----- Methods -----");
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
		
		Field[] f = c.getDeclaredFields();
		
		System.out.println("----- fields -----");
		
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
		}
		
	}
	
}

