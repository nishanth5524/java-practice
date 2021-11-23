package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quantifiers_demo {

	public static void main(String[] args) {

		String str = "abccabaabbcc";

		Pattern p = Pattern.compile("a{1,2}");
		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.println(m.group() + " starts at " + m.start());
		}

	}

}

/*
 
 + - At least one match 
 * - Any number of match including zero
 ? - Atmost one match
 {number} - number of occurrences
 {number1, number2} - number1 and number2 times
  
 */
