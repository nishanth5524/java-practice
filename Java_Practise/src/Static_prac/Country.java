package Static_prac;

public class Country {
    
     static String capital = "Delhi";
     String states;
     
     
     Country()
     {
         
     }
     
     Country(int n,int m)
     {
         //country(int,int);
     }
     Country(int n)
     {
         //country(int);
         if(n>10000)
         {
             System.out.println("okay");
         }
         
         else
         {
             System.out.println("no");
         }
     }

    
}
