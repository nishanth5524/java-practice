package regex;

import java.util.StringTokenizer;

public class StringTokenizerPrac {

	public static void main(String[] args) {
		

		String str = "https:\\www.zoho.com";
		
		StringTokenizer st = new StringTokenizer(str,".",true);
		
//		while(st.hasMoreTokens())
//		{
//			System.out.println(st.nextToken());
//		}
//		
		String[] str1 = str.split("\\:|\\\\|\\.");
		
		for(String s:str1)
		{
			System.out.println(s);
		}
	}

}
