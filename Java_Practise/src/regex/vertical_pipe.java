package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vertical_pipe {

	public static void main(String[] args) {

		String str = "hi hello limca";
		
		Pattern p = Pattern.compile("h|l");
		Matcher m = p.matcher(str);
		
		while(m.find())
		{
			System.out.println(m.group());
		}

	}

}
