package oops;

class A_1
{
	int def_var;
	protected int Pro_var;
	private int Pri_var;
	public int Pub_var;
}


public class Protected_prac extends A_1 {

	public static void main(String[] args) {
		
		Protected_prac obj = new Protected_prac();
		
		obj.def_var=10;
		obj.Pro_var=10;
		obj.Pub_var=10;
		
	}
	
	
}
