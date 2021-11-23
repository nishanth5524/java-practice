package MyBank;

import java.util.*;

public class Proof_of_income extends Proof {

    private String Name;
    private String Acccount_num;
    private String pin;
    private int income;
   
   
    public int income_method(int n,int min_sal) {

        if (n > min_sal) {
            return 1;
        } else {
            return 0;
        }

    }

    public Proof_of_income()
    {
        
    }
    
    public Proof_of_income(String Name, String Acccount_num, String pin, int income) {
        this.Name = Name;
        this.Acccount_num = Acccount_num;
        this.pin = pin;
        this.income = income;
       
    }

   
    public String getName() {
        return Name;
    }

    
    public void setName(String Name) {
        this.Name = Name;
    }

   
    public String getAcccount_num() {
        return Acccount_num;
    }

    
    public void setAcccount_num(String Acccount_num) {
        this.Acccount_num = Acccount_num;
    }

    public String getPin() {
        return pin;
    }

 
    public void setPin(String pin) {
        this.pin = pin;
    }

   
    public int getIncome() {
        return income;
    }

   
    public void setIncome(int income) {
        this.income = income;
    }

   

}
