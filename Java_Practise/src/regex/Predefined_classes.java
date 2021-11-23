package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Predefined_classes {

	public static void main(String[] args) {
		
		String str = "hi hihello limca 1234";

		Pattern p = Pattern.compile("hi\\b");
		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.println(m.group()+" starts at "+m.start());
		}

		
	}
	
}


/*


\\s - space
\\S - non space
\\d - digits
\\D - non digits
\\w - words
\\W - non words
\\b - boundry
\\B - non boundry
\\G - group
.   - all


*/