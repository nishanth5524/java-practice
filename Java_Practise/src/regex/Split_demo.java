package regex;

import java.util.regex.Pattern;

public class Split_demo {

	public static void main(String[] args) {
		
		String str = "Hi hello limca";
		String str2 = "www.zoho.com";
		
		String[] str3 = str2.split("\\s");    /*  \\.  */
		
//		for(String value : str3)
//		{
//			System.out.print(value);
//		}
		
		Pattern p = Pattern.compile("a");
		
		String[] str4 = p.split(str);
		
		for(String value : str4)
		{
			System.out.print(value);
		}
	}
	
	
}
