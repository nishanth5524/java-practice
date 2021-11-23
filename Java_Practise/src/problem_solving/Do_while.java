package problem_solving;

import java.util.Scanner;

public class Do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		
		int i = 0,k=0;
		int[] array = new int[100];
		do
	    {
			i=sc.nextInt();
		 	array[k++]=i;
			
	    }while(i>-1);
		
		array[k-1]=array[k];
		k--;
		
		for(int j=0;j<k;j++)
		{
			System.out.println(array[j]);
		}
	}
	
	
	
}
