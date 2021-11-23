package oops;

public class Student_info {

	private String name;
	private int roll_num;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll_num() {
		return roll_num;
	}

	public void setRoll_num(int roll_num) {
		this.roll_num = roll_num;
	}

	Student_info(String name, int roll_num)
	{
		this.name = name;
		this.roll_num = roll_num;
	}
	
	
}
