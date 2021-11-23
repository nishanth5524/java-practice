package MyBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class SBI extends Tax_Calc {
    
    Proof obj;
    
    
    
    static int Scount = 0;
    
    Scanner sc = new Scanner(System.in);
    public static List<Account_details> list = new ArrayList();
    public static List<Proof_of_income> v = new Vector();
    
    SBI() {
        
        System.out.println("Total SBI COUNT: " + Scount);
        while (true) {
            System.out.println("Welcome to SBI BANK");
            
            System.out.println("1. SignUp");
            System.out.println("2. SignIn");
            System.out.println("3. Apply for credit card");
            System.out.println("4. Tax Calculator");
            System.out.println("5. Quit");
            
            int n = sc.nextInt();
            
            if (n == 1) {
                Sbi_signup();
            } else if (n == 2) {
                Sbi_signin();
            } else if (n == 3) {
               
                try{
                    int s_min_sal = 6000;
                Credit_card ob1 = new Credit_card();
                Proof_of_income obj = ob1.Credit(6000,5000+Scount);
                Scount++;
                v.add(obj);
                System.out.println("Name: "+obj.getName());
                System.out.println("account number: "+obj.getAcccount_num());
                }catch(Exception e)
                {
                   
                }
                
            }else if(n==4){
                System.out.println("Enter Your Annual Salary: ");
                int Sal = sc.nextInt();
                t_calc(Sal);
                }
            else if (n == 5) {
                break;
            } else {
                System.out.println("Enter correct option");
            }
        }
        
    }
    
    public static void Sbi_signin() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
            String accountNumber = sc.nextLine();
            System.out.println("ENTER YOUR PIN NUMBER : ");
            String pin = sc.nextLine();
            
            Account_details ob = findAccount(accountNumber, pin);
            
            openAccount(ob);
        } catch (Exception e) {
            System.out.println("Account not found");
        }
    }
    
    public static Account_details findAccount(String accountNumber, String pin) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAccount_Number().equals(accountNumber) && list.get(i).getPin().equals(pin)) {
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
            System.out.println("4. Change Pin");
            System.out.println("5. Quit");
            
            int n = s.nextInt();
            
            if (n == 1) {
                System.out.print("Enter amount to Deposit: ");
                int a = s.nextInt();
                ob.setBalance(ob.getBalance() + a);
                System.out.println("Total Balance: " + ob.getBalance());
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
                System.out.println("account number: " + ob.getAccount_Number());
                System.out.println("amount: " + ob.getBalance());
            } else if (n == 4) {
                 ob.setPin(ob);
                
            }
            else if(n==5)
            {
                break;
            }
            
            else {
                System.out.println("Enter correct option");
            }
            
        }
    }
    
    public void Sbi_signup() {
        
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("Enter you choice");
            System.out.println("1. With Minimum Balance");
            System.out.println("2. Without Minimum Balance");
            System.out.println("3. Quit");
            
            int n = sc.nextInt();
            
            if (n == 1) {
                Scount++;
                int num=Scount+1000;
                String acc_str=Integer.toString(num);
                Signup_minimum_balance obj1 = new Signup_minimum_balance();
                Account_details ob1 = obj1.Signup_min(acc_str);
                list.add(ob1);
                openAccount(ob1);
                break;
            } else if (n == 2) {
                Scount++;
                int num=Scount+1000;
                String acc_str=Integer.toString(num);
                Signup_no_minimum_balance obj2 = new Signup_no_minimum_balance();
                Account_details ob2 = obj2.Signup_nomin(acc_str);
                list.add(ob2);
                openAccount(ob2);
                break;
            } else if (n == 3) {
                break;
            } else {
                System.out.println("Enter correct option");
            }
        }
    }
    
}
