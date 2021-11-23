package Thread_project;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Loan implements Runnable {

    int i;
    int Loan_fee;
    public static int total_fee = 0;
       
    Loan(int i, int Loan_fee) {

        this.i = i;
        this.Loan_fee = Loan_fee;
    }
    
   
    
//      public void Add_Loan_fee() {
//           Object Obj_lock = Loan.class;
//           synchronized (Obj_lock){
//           total_fee = total_fee + Loan_fee;
//           }
           
//    }
    
   synchronized static void Add_Loan_fee(Loan Lobj)
    {
       total_fee=total_fee+Lobj.Loan_fee;   
    }
    
    public void run() {
        System.out.println("Start Thread " + Thread.currentThread().getName() + " for customer " + i);
        Add_Loan_fee(this);
    //    Add_Loan_fee();
        System.out.println("End Thread " + Thread.currentThread().getName() + " for customer " + i);
        System.out.println("Amount collected so for: " + total_fee);
    }
     
   
}