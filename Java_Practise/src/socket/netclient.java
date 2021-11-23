package socket;

import java.io.*;
import java.net.*;
class NetClient extends Thread{
    public static void main(String args[]){
        try{
            final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            InetAddress my_address = InetAddress.getLocalHost();
            System.out.println("Enter the IP Address of server ");

            String address = br.readLine();
            final Socket client = new Socket(address,6066);

            Thread reader_thread = new Thread(){
                public void run(){
                    while(true){
                        try{
                            InputStream from_server = client.getInputStream();
                            DataInputStream in = new DataInputStream(from_server);
                            System.out.println("Him: " + in.readUTF());
                        }
                        catch(Exception e){}
                    }
                }
            };

            Thread writer_thread = new Thread(){
                public void run(){
                    while(true){
                        try{
                            final String message = br.readLine();
                            OutputStream to_send = client.getOutputStream();
                            DataOutputStream out = new DataOutputStream(to_send);
                            out.writeUTF(message);
                        }
                        catch(Exception e){}
                    }
                }
            };

            reader_thread.start();
            writer_thread.start();
        }
        catch(Exception e){
            System.out.println("Houston.. we have a problem " + e);
        }
    }
}  

