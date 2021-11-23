/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPS;

/**
 *
 * @author admin
 */
public class Employee  {

    
    /*
        Inheritance  -> Is a relationship
        Compose -> Has a relationship
    
    */
    AgeProof ageProof;
    Calculator myCalc;
    public Employee(AgeProof proof) {
       ageProof = proof;
    }
    
    public int getAge(){
       return  ageProof.getAge();
       
    }
    
    public static void main(String[] args) {
        Employee nishanth = new Employee(new AadhaarCardProof());
        nishanth.getAge();
        
    }
    
}
