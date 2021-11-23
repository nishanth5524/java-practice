
package socket;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class clientLogin {


    Socket socket;
    BufferedReader read;
    PrintWriter output;

    public void startClient() throws UnknownHostException, IOException{
         socket = new Socket("localhost", 7000);
         
        output = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
       
      
        String username = JOptionPane.showInputDialog(null, "Enter User Name:");
        output.println(username);
       String password = JOptionPane.showInputDialog(null, "Enter Password");
       output.println(password);
        output.flush();
        read = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String response = read.readLine();
        System.out.println("This is the response: " + response);
        JOptionPane.showMessageDialog(null, response);
    }



    public static void main(String args[]){
        clientLogin client = new clientLogin();
        try {
            client.startClient();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
