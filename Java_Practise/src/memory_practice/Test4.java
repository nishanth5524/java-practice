package memory_practice;


public class Test4 {

	static int i = 10;
	
	static 
	{
		m1();
		System.out.println(i);
		int[] a = new int[5];
	}
	
	public static void m1()
	{
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("Main Method");
	}
}
