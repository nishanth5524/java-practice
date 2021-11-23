package problem_solving;

import java.util.Scanner;

public class PuzzleCode {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String Code = sc.nextLine();
		
		char[] ch = Code.toCharArray();
		
		if(ch[0]=='n' || ch[0]=='e' || ch[0]=='w' || ch[0]=='s')
		{
			
			if(ch[1] <= 'f' && ch[1] >= 'a')
			{
				
			}
			
			else
			{
				System.out.println("Invalid Block Name");
			}
		}
		
		else
		{
			System.out.println("InValid Gate Name");
		}
		
	}
	
	
}
