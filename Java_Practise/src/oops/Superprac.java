package oops;

interface abcd
{
	int var=10;
	void show();
}


class Grandparent 
{
	Grandparent()
	{
		System.out.println("Parent1 constructor");
	}
	
	Grandparent(int age)
	{
		System.out.println("Parent1 constructor");
	}
	
	Grandparent(int a,int b,int c,int d)
	{
		int sum = a+b+c+d;
		System.out.println(sum);
	}

	
	public void show() {
		
		
	}

}

class parent extends Grandparent implements abcd
{

	static int e=10;
	
	parent(int a,int b,int c)
	{
		super(a,b,c,e);
		int mul = a*b*c;
		System.out.println(mul);
	}
			
	parent()
	{
		super(10);
		System.out.println("Parent constructor");
	}
	
	public void show()
	{
		System.out.println("Parent Show");
		
	}
}

class child extends parent
{


	
	child(int a,int b,int c)
	{
		//parent.e = 15;
		super(a,b,c);
		int sum = a+b+c;
		System.out.println(sum);
		
		
		
		System.out.println(parent.e);
	}
	child()
	{
		super();  
		//super.show();
		//System.out.println(super.a);
		
		System.out.println("child constructor");
	}
	
	
}



public class Superprac {
	
	public static void main(String[] args) {
		
	parent.e = 15;
		
    child ob1 = new child(1,2,3);
	
    parent.e=10;
    
    child.e = 10;
	
	System.out.println("-------------");
	
	
	child ob2 = new child(1,2,3);
	
	//ob1.show();  
		
	
	
	}

	
}
