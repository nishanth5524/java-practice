package MyBank;

import java.util.Scanner;

public class Signup_no_minimum_balance {

    

    public Account_details Signup_nomin(String acc_str) {
      
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        String Pin;
        while (true) {
            System.out.println("ENTER PIN");
            Pin = sc.nextLine();
            System.out.println("CONFIRM PIN");
            String confirmPin = sc.nextLine();
            if (Pin.equals(confirmPin)) {
                break;
            } else {
                System.out.println("PIN MISMATCH");
            }
        }

          Account_details obj = new Account_details(Name, acc_str, Pin);
        //SignUp obj = new SignUp(Name, Account_Number, Pin);

        return obj;
    }
}
