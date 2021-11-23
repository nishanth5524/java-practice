package problem_solving;

import java.util.Scanner;

public class RemoveExtraInString {

	static char findExtraCharcter(char []strA, char[] strB)
	{
		
		int[] m1 = new int[256];

		for (int i = 0; i < strB.length; i++)
			m1[strB[i]]++;
		for (int i = 0; i < strA.length; i++)
			m1[strA[i]]--;

		for (int i=0;i<m1.length;i++)
		{
			if (m1[i]== 1)
				return (char) i;
		}
		return Character.MIN_VALUE;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String strA = sc.nextLine();
		String strB = sc.nextLine();

		System.out.println(findExtraCharcter(strA.toCharArray(), strB.toCharArray()));
		}
	}

