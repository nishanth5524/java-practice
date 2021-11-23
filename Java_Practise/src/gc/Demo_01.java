package gc;

import java.util.Date;

public class Demo_01 {
	
	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime();
		
		System.out.println("Total Memory: "+r.totalMemory());
		System.out.println("freeMemory: "+r.freeMemory());
		
		for(int i=0;i<1000;i++)
		{
			Date obj = new Date();
			obj=null;
		}
		
		System.out.println("freeMemory: "+r.freeMemory());
		r.gc();
		System.out.println("freeMemory: "+r.freeMemory());
				
	}
	
	

}
