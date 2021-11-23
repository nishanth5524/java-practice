/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoProject;

import java.util.Scanner;


public class practise {
    
    public static void main(String args[])
    {
        int n;
        
        Scanner s= new Scanner(System.in);
        
        n=s.nextInt();
        
        int a[]=new int[10];
        
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
