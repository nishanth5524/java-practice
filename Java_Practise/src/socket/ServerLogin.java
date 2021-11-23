package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ServerLogin {

    ServerSocket serversocket;
    Socket client;

    BufferedReader input;
    PrintWriter output;

    public void start() throws IOException{
        serversocket = new ServerSocket(7000);
        System.out.println("Connection Starting on port:" + serversocket.getLocalPort() );
       
        client = serversocket.accept();

        System.out.println("Waiting for connection from client");

        try {
            logInfo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logInfo() throws Exception{
        
        input = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String username = input.readLine();
        System.out.println("username" + username);
        String password = input.readLine();
        System.out.println("password" + password);

        output = new PrintWriter(new OutputStreamWriter(client.getOutputStream()));

         try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
            String query = "Select username, password from Logindata where username='"+username+"' and password='"+password+"'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
         
       System.out.println("Success!    ");
       output.println("Welcome, " + username);
                    } else {
                        System.out.println("error!    ");
                        output.println("Login Failed");
                    }
        con.setAutoCommit(true);
            con.close();
          }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }

        output.flush();
        output.close();

    }
    public static void main(String[] args){
        ServerLogin server = new ServerLogin();
        try {
            server.start();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }       

}