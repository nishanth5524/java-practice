package problem_solving;

import java.util.Scanner;

public class Missing_num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[100];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
	
	
		int min=1234567;
		int max=-1234567;		
		
		for(int i=0;i<n;i++)
		{
			if(min>a[i])
				min = a[i];
			
			if(max<a[i])
				max=a[i];
		}
		
		System.out.println(min+" "+max);
		
		for(int i=min;i<=max;i++)
		{
			int flag=0;
			
			for(int j=0;j<n;j++)
		    {
			    if(i==a[j])
			    {
			    	flag=1;
			    }
			    
	        }
			
			if(flag == 0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
}
