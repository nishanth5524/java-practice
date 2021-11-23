package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_prac {

	public static void main(String[] args) {
		
		String sentence = "thupparku thuppaya thuppaki thupparku thuppaya thoovum malai";
		Pattern p = Pattern.compile("thuppa");
		Matcher m = p.matcher(sentence);
		
		while(m.find())
		{
			System.out.println(m.group()+m.start());
		}
		
	}
	
	
}
