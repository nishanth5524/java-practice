package MyBank;

import java.util.Scanner;

public class Credit_card {
Scanner sc = new Scanner(System.in);
    public Proof_of_income Credit(int min_sal,int acc_no) {

        
        Proof_of_income obj = new Proof_of_income();
        System.out.println("Enter your monthly income: ");
        int inc = sc.nextInt();
        if (obj.income_method(inc,min_sal) == 1) {
            
            
           
            String Pin;
                     
            while (true) {
            System.out.println("ENTER PIN: ");
            Pin = sc.nextLine();
            
            if(Pin.length()!=4)
                System.out.println("PIN must contain 4 number");
            else
            {
            System.out.println("CONFIRM PIN");
            String confirmPin = sc.nextLine();
            if (Pin.equals(confirmPin)) {
                break;
            } else {
                System.out.println("PIN MISMATCH");
            }
            }
            
        }
             
            System.out.println("Enter Name: ");
            String name = sc.nextLine();  
            
            System.out.println("Enter your monthly income: ");
            int income = sc.nextInt();
            String Acccount_num=Integer.toString(acc_no); 
            Proof_of_income ob = new Proof_of_income(name, Acccount_num, Pin, income);
            return ob;
        }

        else
        {
        System.out.println("Sorry Your income is low to Create Credit Card: ");    
        return null;
        }
    }
}
