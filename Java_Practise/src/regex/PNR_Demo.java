package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PNR_Demo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int flag = 1;
		String pnr = null;
		while(flag == 1)
		{
		System.out.println("Enter Passenger Name Record(PNR) Number: ");

		pnr = sc.nextLine();

		Pattern p = Pattern.compile("^T");
		
		Matcher m = p.matcher(pnr);

		if (m.find()) {
			flag = 0;
			
		}

		else {
			System.out.println("Invalid from input\n");
		}
		
		}
		
	}
}
