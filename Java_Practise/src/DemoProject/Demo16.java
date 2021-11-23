
package DemoProject;

import java.util.Scanner;

public class Demo16 {

    public static void main(String args[])
    {
  int a[]=new int[10];
  int i,n;
  
  Scanner s = new Scanner(System.in);
  
  n=s.nextInt();
  
  for(i=0;i<n;i++)
  {
      a[i]=s.nextInt();
  }
  
   for(i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }

    }
}
