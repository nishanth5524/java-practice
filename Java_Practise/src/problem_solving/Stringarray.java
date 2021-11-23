package problem_solving;

import java.util.Scanner;

public class Stringarray {

	public static void main(String[] args) {
	
		char[] str={'1','2','3','4','5','6','7','8','2','1'};
		
		String[] string={"ABC","BCD","CDE"};
		
		String[] string_int={"132","321","123"};
		
		int[] arr ={1,2,3,4,5,6,7,8};
		
		String str_int = "1 2 3 4";
		
		String str_char = "java";
		
		int[] arr_int = new int[100];
		
		
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = null;
	    int a[] = new int[100];
	    int k=0;
		
		 while (sc.hasNext()) {
			
		        s1 = sc.next();
		        System.out.print(s1+" ");
		        a[k++]=Integer.parseInt(s1);
		        
		        
		        if (s1.equals("exit")) {
		            break;
		        } 
		      }
	
		 System.out.println();
		 
		 for(int i=0;i<k;i++)
		 {
			 System.out.print(a[i]+" ");
		 }
	}
	
	
}
