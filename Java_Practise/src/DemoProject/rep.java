package DemoProject;

import java.util.*;

public class rep {
    
    int min(int n)
    {
       
        int min_num=2345678;
        
        while(n>0)
        {
            int rem=n%10;
            
            if(rem<min_num)
            {
                min_num=rem;
            }
            
            n=n/10;
        }
       return min_num;
    }
    
    int max(int n)
    {
       int max_num=-2345678;
        
        while(n>0)
        {
            int rem=n%10;
            
            if(rem>max_num)
            {
                max_num=rem;
            }
            
            n=n/10;
        }
       return max_num;
    }
    void claculate(int a,int b,int c)
    {
         int max1=max(a);
         int max2=max(b);
         int max3=max(c);
         int min1=min(a);
         int min2=min(b);
         int min3=min(c);
               
         int min_num=min1+min2+min3;
         int max_num=max1+max2+max3;
         
         System.out.println(min_num-max_num);
    }   
    
    
    public static void main(String args[])
    {
         Scanner S = new Scanner(System.in);
         int i=S.nextInt();
         int j=S.nextInt();
         int k=S.nextInt();
         
         rep obj = new rep();
         obj.claculate(i, j, k);
         
    }
    
}
