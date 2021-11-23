package socket;

import java.net.*;
import java.io.*;
import java.util.Scanner;
public class server {
 
 public static void main(String args[])throws Exception 
 {

   Scanner scanner = new Scanner(System.in);

   System.out.print("Enter the Value    :   ");
   
   String s1=scanner.nextLine();


   ServerSocket ss = new ServerSocket(7000);

   while(true)
   {

    System.out.println("Waiting");

    Socket s = ss.accept();

    OutputStream os = s.getOutputStream();

    DataOutputStream dos=new DataOutputStream(os);

    dos.writeUTF(s1);
   }
 }
} 