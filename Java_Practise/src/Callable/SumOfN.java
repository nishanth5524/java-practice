package Callable;

import java.util.concurrent.Callable;

public class SumOfN implements Callable<Integer>{

	int num;
	
	SumOfN(int num)
	{
		this.num = num;
	}
	
	
	public Integer call() throws Exception {
	
		Thread.sleep(3000);
		
		int sum=0;
		
		//System.out.println("Calculating by Thread -> "+Thread.currentThread().getName());
		
		for(int i=0;i<num;i++)
		{
			sum = sum + i;
		}
		
       return sum;
	}

	
	
}
