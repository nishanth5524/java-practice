package gc;

import java.util.Scanner;  

public class StringNTimes { 
	
	public static void main(String[] args) throws Exception { 
		Scanner in = new Scanner(System.in); 
		
		//System.out.println("Enter string: "); 
		//String s = in.next(); 
		//System.out.println("Enter value for n: "); 
		//int n = in.nextInt(); 
		
		String s = "abcdefghijklmnopqrstuvwxyz";
		int n = 1000000;
		
		Thread.sleep(1000000);
		
		StringBuilder str = new StringBuilder(s); 
		for(int i = 0; i < n; i++) { 
			str.append(s); 
			Thread.sleep(1);
			
			
		} 
		
		
	//System.out.println("New String: " + str.toString()); 
	} 
} 
