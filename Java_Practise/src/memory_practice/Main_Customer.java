package memory_practice;

import java.util.ArrayList;
public class Main_Customer {

	public static void main(String[] args) {
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		while(true){
			
			Customer obj = new Customer("Nishanth");
			
			if(list.size()>100)
			{
				for(int i=0;i<10;i++)
				{
					list.remove(0);
				}
			}
			
		}
		
		
	}
	
}
