package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phonenumber {

	public static void main(String[] args) {
		
		String phone = "07010107474";
		
		Pattern ptrn = Pattern.compile("(0|91)?[6-9][0-9]{9}");  
		Matcher match = ptrn.matcher(phone); 
		
		if(match.find())
		{
			System.out.println("Valid");
		}
		
		else
		{
			System.out.println("Not Valid");
		}
	}
	
}
