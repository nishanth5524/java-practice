package oops;

public class String_Intern {

	public static void main(String[] args) {
		
		String str = new String("hi");
		String str1 = new String("hi");
		
		String Dummy = "hello";
		
		String strpool = Dummy;
		String strpool2 = Dummy;
		
		System.out.println(str1 == str); 
		
		System.out.println(strpool == strpool2); 
		
	}
}
