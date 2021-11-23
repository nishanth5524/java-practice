package socket;

import java.net.*;
import java.io.*;
class client
{
 public static void main(String args[])throws Exception 
 {
    Socket s=new Socket("127.0.0.1",7000);

    InputStream is = s.getInputStream();
    
    DataInputStream dis=new DataInputStream(is);

    String result=dis.readUTF();

    System.out.println("--------------> "+result);
 }
}