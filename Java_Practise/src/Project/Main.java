package Project;

import java.util.*;

public class Main {

    static List<Account_details> list = new ArrayList<Account_details>();

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("----------Enter your choice---------");
            System.out.println("1. Signin");
            System.out.println("2. Login");
            System.out.println("3. Quit");

            int choice = s.nextInt();

            if (choice == 1) {
                signin();
            } else if (choice == 2) {
                login();
            } else if (choice == 3) {
                System.out.println("Thank you for using this application");
                break;
            } else {
                System.out.println("Enter correct option");
            }

        }

    }

    public static void signin() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = s.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER : ");
        String accountNumber = s.nextLine();
        int pin;
        while (true) {
            System.out.println("ENTER PIN");
            pin = s.nextInt();
            System.out.println("CONFIRM PIN");
            int confirmPin = s.nextInt();
            if (pin == confirmPin) {
                break;
            } else {
                System.out.println("PIN MISMATCH");
            }
        }
        System.out.println("ENTER MINIMUM BALANCE TO BE ADDED : ");
        int amount = s.nextInt();

        Account_details ob = new Account_details(name, accountNumber, amount, pin);
        list.add(ob);

        System.out.println("ACCOUNT REGISTER SUCCESSFUL");
        
        System.out.println("Total number of account: "+ob.serial_num);
        
        openAccount(ob);
    }

    public static void login() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
            String accountNumber = sc.nextLine();
            System.out.println("ENTER YOUR PIN NUMBER : ");
            int pin = sc.nextInt();

            Account_details ob = findAccount(accountNumber, pin);

            openAccount(ob);
        } catch (Exception e) {
            System.out.println("Account not found");
        }
    }

    public static Account_details findAccount(String accountNumber, int pin) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccountNumber().equals(accountNumber) && list.get(i).getPin() == pin) {
                return list.get(i);
            }
        }

        return null;
    }

    public static void openAccount(Account_details ob) {
        Scanner s = new Scanner(System.in);

        while (true) {
            
            System.out.println("Account name: " + ob.getName());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Details");
            System.out.println("4. Quit");

            int n = s.nextInt();

            if (n == 1) {
                System.out.print("Enter amount to Deposit: ");
                int a = s.nextInt();
                ob.setBalance(ob.getBalance() + a);
                System.out.println("Total Balance: " + ob.getAccountNumber());
            } else if (n == 2) {
                System.out.print("Enter amount to withdraw: ");
                int a = s.nextInt();
                if (a > ob.getBalance()) {
                    System.out.println("Insufficient balance!");
                    // break;
                    continue;
                }
                ob.setBalance(ob.getBalance() - a);
                System.out.println("Total Balance: " + ob.getBalance());
            } else if (n == 3) {
                System.out.println("Name: " + ob.getName());
                System.out.println("account number: " + ob.getAccountNumber());
                System.out.println("amount: " + ob.getBalance());
            } else if (n == 4) {
                break;
            } else {
                System.out.println("Enter correct option");
            }

        }

    }
}
