
package socket;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class netserver extends Thread{

    int flag = 0;
    private ServerSocket serverSocket;
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Socket server;
    public netserver(int port) throws IOException{
        serverSocket = new ServerSocket(port);
    }

    public void run(){
        try{
            InetAddress my_address = InetAddress.getLocalHost();
            System.out.println(my_address);
            server = serverSocket.accept();
            System.out.println("Connected to " + server.getRemoteSocketAddress());
        }
        catch(IOException e){
            System.out.println(e);
        }
    }

    public static void main(String [] args){
        int port = 6066;
        try{

            Thread connector = new netserver(port);
            connector.start();
            try{connector.join();}catch(Exception e){}
            
            
            Thread reader_thread = new Thread(){
                public void run(){
                    while(true){
                        try{
                            DataInputStream in = new DataInputStream(server.getInputStream());
                            System.out.println("Him: " + in.readUTF());
                        }catch(Exception e){}
                    }
                }
            };

            Thread writer_thread = new Thread(){
                public void run(){
                    while(true){
                        try{
                            String message = br.readLine();
                            DataOutputStream out = new DataOutputStream(server.getOutputStream());
                            out.writeUTF(message);
                        }catch(Exception e){}
                    }
                }
            };
            reader_thread.start();
            writer_thread.start();
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}  

