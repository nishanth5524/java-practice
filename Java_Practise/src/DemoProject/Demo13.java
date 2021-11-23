
package DemoProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Demo13 {
    
    public static void main(String args[])
    {
        Y obj = new Y(); 
    }
    
}

class Y extends JFrame implements ActionListener
 {
     JTextField Qtf;
      JButton bt;
     public Y()
     {
         
         
          Qtf = new JTextField();
         Qtf.setBounds(360,200,150,30);
         add(Qtf);
         bt = new JButton();
         bt.setBounds(360,250,150,30);
         add(bt);
         bt.addActionListener(this);
         
       
         setLayout(null);
         setVisible(true);
         setLocation(250,100);  
         setSize(900,500); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
      public void actionPerformed(ActionEvent e)
        {
         String Tablename = Qtf.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
         Statement  st = con.createStatement();
         String query ="create table "+Tablename+"(Question varchar(500),Option1 varchar(20),Option2 varchar(50),Option3 varchar(50),Option4 varchar(50),COption int,Qnum int)";
         st.executeUpdate(query);
         con.setAutoCommit(true);
         con.close();
         System.out.println("Success!    ");
         }
        catch(Exception et)
        {
            System.out.println("error->"+et); 
        }
        } 
}