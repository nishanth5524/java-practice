package MyBank;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        
        

        while (true) {

            System.out.println("Welcome to MyBank :-)");

            System.out.println("Select your Bank");
            System.out.println("1. SBI");
            System.out.println("2. KVB");
            System.out.println("3. HDFC");
            System.out.println("4. Total accounts created");
            System.out.println("5. Quit");

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();

            if (n == 1) {
                SBI Sobj = new SBI();
            } else if (n == 2) {
                KVB Kobj = new KVB();
            } else if (n == 3) {
                HDFC Hobj = new HDFC();
            } else if (n==4){ 
                 System.out.println("Total account created: "+Account_details.getTotalacc());
                // Account_details ob = new Account_details();
                 //System.out.println("->"+ob.getTotalacc());
            }
            else if (n == 5) {
                System.out.println("Thanks for using this application :-)");
                break;
            } else {
                System.out.println("Enter valid option");
            }
        }
    }
}
