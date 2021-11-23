
package DemoProject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.Statement;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo12 {
    
      public Demo12()
      {
          try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
         Statement  st = con.createStatement();
         String query ="create table qanda2(Question varchar(500),Option1 varchar(20),Option2 varchar(50),Option3 varchar(50),Option4 varchar(50),COption int,Qnum int)";
         st.executeUpdate(query);
         con.setAutoCommit(true);
         con.close();
         System.out.println("Success!    ");
         }
        catch(Exception e)
        {
            System.out.println("error->"+e); 
        }
        }
      
      public static void main(String args[])
      {
          new Demo12();
      }
      
    }
       
          
        
    
    
    