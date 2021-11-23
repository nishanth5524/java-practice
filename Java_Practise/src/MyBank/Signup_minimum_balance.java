package MyBank;

import java.util.Scanner;

public class Signup_minimum_balance {

   

    public static Account_details Signup_min(String acc_str) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        String Pin;
        while (true) {
            System.out.println("ENTER PIN: ");
            Pin = sc.nextLine();
            
            if(Pin.length()!=4)
                System.out.println("PIN must contain 4 number");
            else
            {
            System.out.println("CONFIRM PIN: ");
            String confirmPin = sc.nextLine();
            if (Pin.equals(confirmPin)) {
                break;
            } else {
                System.out.println("PIN MISMATCH");
            }
            }
        }
        System.out.println("Enter Balance: ");
        int Balance = sc.nextInt();

          System.out.println("Your Account Number: "+acc_str);
           Account_details obj = new Account_details(Name, acc_str, Pin, Balance);
        return obj;
    }

}
