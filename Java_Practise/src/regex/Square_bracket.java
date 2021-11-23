package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Square_bracket {

	public static void main(String[] args) {

		String str = "abccabaabbc@#";

		Pattern p = Pattern.compile("[^a-zA-Z0-9]");
		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.println(m.group());
		}

	}
}
