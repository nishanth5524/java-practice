/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Calculators {
    
    /*
    
    Bank:
    
        How an object should be created -> Constructor
        List<Accounts>
        List<Staff>
        List<Branch>
    
        addAccount()
        deleteAccount()
    
        class based behavior -> Static variables ->
         BankCount
    
         Static methods -> Common utils -> Independant functionalities
         FillingUpAChallan(Challan ch)
    
         Static blocks ->  Code to be invoked during class initialization
    
        Static classes -> It can be used only for inner classes to provide access for static variables of outer class
        
    */
    
    public int output;
    private int errorValue;

    private static int defaultError;//  = initializeError();
    
    static{
        defaultError = initializeError();
        System.out.println("Class created with error value "+defaultError);
    }
    public Calculators(int error) {
        if(error < 0){
            errorValue = defaultError;
                    
        }
        else {
            errorValue = error;
        }
    }
    
    
    
    public static void main(String[] args) {
        Calculators m1Calc = new Calculators(1);
        m1Calc.addition(10, 15);
        
        Calculators m2Calc = new Calculators(5);
        m2Calc.addition(10, 15);
    }
    public   void  addition(int a , int b){
        output = a+b+errorValue;
        System.out.println("Sum is "+ (output));
    }
    
    private static int  initializeError(){
    
        Scanner sc = new Scanner(System.in);
        int error = sc.nextInt();
        
        return error;
    }
}
