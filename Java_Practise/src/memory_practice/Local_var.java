package memory_practice;


public class Local_var {

	public static void main(String[] args) {
		
		int local_variable = 5;
		calculate(local_variable);
		System.out.println(local_variable);
	}
	
	public static void calculate(int cal)
	{
		cal = cal * 100;
	}
	
	
}
