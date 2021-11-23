package MyBank;

import java.util.Scanner;

public class Account_details {

    private String Name;
    private String Account_Number;
    private String Pin;
    private int Balance = 0;
    static private int count;

    public Account_details(String Name, String Account_Number, String Pin, int Balance) {

        this.Name = Name;
        this.Account_Number = Account_Number;
        this.Pin = Pin;
        this.Balance = Balance;
        count++;

    }

    
  //  public  Account_details(){
        
  // }
    
    public static int getTotalacc()
    {
        return count;
    }
    public Account_details(String Name, String Account_Number, String Pin) {

        this.Name = Name;
        this.Account_Number = Account_Number;
        this.Pin = Pin;
        count++;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAccount_Number() {
        return Account_Number;
    }

    public void setAccount_Number(String Account_Number) {
        this.Account_Number = Account_Number;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(Account_details obj) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your old Pin");
        String n = sc.nextLine();

        if (obj.Pin.equals(n)) {
            
            while (true) {
          System.out.println("Enter your New Pin");
            String new_pin = sc.nextLine();
            
            if(new_pin.length()!=4)
                System.out.println("PIN must contain 4 number");
            else
            {
            System.out.println("CONFIRM PIN: ");
            String confirmPin = sc.nextLine();
            if (new_pin.equals(confirmPin)) {
                obj.Pin = new_pin;
                break;
            } else {
                System.out.println("PIN MISMATCH");
            }
            }
        }
            
            
        }
        else
        {
           System.out.println("Invalid Pin"); 
        }

        this.Pin = Pin;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

}
