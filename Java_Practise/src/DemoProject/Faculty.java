
package DemoProject;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;  
import java.awt.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;  


public class Faculty {
    
        
    public static void main(String args[])
    {
        Login obj = new Login();
    }
}

class Login extends JFrame
 {
     public Login()
     {
    pack();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(screenSize.width, screenSize.height);
    System.out.println(screenSize.height);
    System.out.println(screenSize.width);
    JButton l = new JButton("Login");
    l.setBounds(600,300,150,30);
    add(l);
    
    JLabel image1 = new JLabel(new ImageIcon("D:\\01.jpg"));
    image1.setSize(screenSize.height,screenSize.width);
    add(image1);
         
         l.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
                 new facultyspace();
                 dispose();
             }
         });
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
 }
 class facultyspace extends JFrame
 {
     public facultyspace()
     {
         JButton b = new JButton("Student details");
         JButton b1 = new JButton("Create Question");
         JButton b2 = new JButton("Result");
         pack();
         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
         setSize(screenSize.width, screenSize.height);
         b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
                 new Qtablename();
                 dispose();
             }
         });
         
         b.setBounds(600,250,150,30);
         add(b);

         b1.setBounds(600,300,150,30);
         add(b1);
  
         b2.setBounds(600,350,150,30);
         add(b2);

         JLabel image2=new JLabel(new ImageIcon("D:\\01.jpg"));
          image2.setSize(screenSize.height,screenSize.width);
          add(image2); 
         
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
 }

class Qtablename extends JFrame implements ActionListener
 {
     JTextField Qtf;
      JButton bt,bt1;
      JLabel lt,image3,lt1,lt2,lt3;
     public Qtablename()
     {
          pack();
          Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
          setSize(screenSize.width, screenSize.height);
         
        
         lt = new JLabel("Enter Test name:");
         lt.setBounds(480,265,100,100);
         add(lt); 
         lt1 = new JLabel("<HTML> NOTE: test name should be in format SUBJECT + TEST NO example:Javatest1<HTML>");
         lt1.setBounds(480,315,120,100);
         lt1.setForeground(Color.red);
         add(lt1); 
        
         Qtf = new JTextField();
         Qtf.setBounds(600,300,150,30);
         add(Qtf);
         lt3= new JLabel("");
         lt3.setBounds(755,295,450,40);
         add(lt3); 
         
         
         bt = new JButton("Submit");
         bt.setBounds(630,400,100,30);
         add(bt);
          bt.addActionListener(this);
       image3=new JLabel(new ImageIcon("D:\\01.jpg"));
       image3.setSize(screenSize.height,screenSize.width);
       add(image3);
       
         
         setVisible(true);
         setLocationRelativeTo(null); 
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
      public void actionPerformed(ActionEvent e)
        {
         String Tablename = Qtf.getText();
                 
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
         Statement  st = con.createStatement();
         String query ="create table "+Tablename+"(Question varchar(500),Option1 varchar(20),Option2 varchar(50),Option3 varchar(50),Option4 varchar(50),COption int,Qnum int,Time int)";
         st.executeUpdate(query);
         con.setAutoCommit(true);
         con.close();
         System.out.println("Success!    ");
         new AddQuestion(Tablename);
         dispose();
         }
        catch(Exception et)
        {
            lt3.setForeground(Color.red);
           lt3.setText("*Test name cannot contain only numbers and cannot contain Space");
            System.out.println("error->"+et.toString()); 
            if(et.toString().matches("com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException: Table '"+Tablename+"' already exists"))
               {
                 lt3.setText("*Test name already exists"); 
               }
            
        }
        } 
}

 class AddQuestion extends JFrame 
{  
   
    JTextField A1,A2,A3,A4;  
    JButton b1,b2;
    JLabel l,al1,al2,al3,al4,optionl,label,image4,lt2,lt3,lt4,testnamel;
    JLabel Qlabel,a1label,a2label,a3label,a4label,optionlabel,timinglabel;
    JTextField Qarea,tf,ttf;
    int count=1;
  AddQuestion(String Tablename)  
    {  
        pack();
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setSize(screenSize.width, screenSize.height);
    setLocationRelativeTo(null);
    
    testnamel=new JLabel("Test id:"+Tablename);
    testnamel.setBounds(530,65,450,40);
    testnamel.setFont(new Font("Serif",Font.PLAIN,30));
    add(testnamel);
        
        l=new JLabel("Enter Question "+count);
        l.setBounds(380,140,450,40);  
        add(l);
        
        Qarea=new JTextField();  
        Qarea.setBounds(480,140,450,40);  
        add(Qarea);  
                
       al1=new JLabel("Enter Option 1: ");
       al2=new JLabel("Enter Option 2: ");
       al3=new JLabel("Enter Option 3: ");
       al4=new JLabel("Enter Option 4: ");
       
       al1.setBounds(380,200,100,20);  
       al2.setBounds(380,230,100,20);  
       al3.setBounds(380,260,100,20);  
       al4.setBounds(380,290,100,20); 
 
       
       add(al1);
       add(al2);
       add(al3);
       add(al4);
       
       
      A1=new JTextField();     
      A2=new JTextField();      
      A3=new JTextField();
      A4=new JTextField();
      A1.setBounds(480,200,200,25);  
      A2.setBounds(480,230,200,25);  
      A3.setBounds(480,260,200,25);  
      A4.setBounds(480,290,200,25);  
      add(A1);
      add(A2);
      add(A3);
      add(A4);
      
       optionl=new JLabel("Enter Correct Option: ");
      optionl.setBounds(380,335,210,18);
       add(optionl);
       
       tf=new JTextField();
        tf.setBounds(510,330,120,25);
       add(tf);
       
       b1=new JButton("next"); 
        b1.setBounds(620,500,100,30);  
       add(b1);
       
       
       b2=new JButton("Done"); 
        b2.setBounds(820,500,100,30);
       add(b2);
       
       b2.setVisible(false);
       
       lt2 = new JLabel("Enter Question timing:");
         lt2.setBounds(380,375,150,40);
         add(lt2);
          lt4 = new JLabel("  (in minutes)");
         lt4.setBounds(380,385,150,40);
         add(lt4);
         ttf = new JTextField();
         ttf.setBounds(510,385,120,25);
         add(ttf);
         lt3 = new JLabel("");
         lt3.setBounds(510,400,250,40);
         lt3.setForeground(Color.red);
         add(lt3); 
         
           ttf.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = ttf.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar()==8) {
               ttf.setEditable(true);
               lt3.setText("");
            } else {
               ttf.setEditable(false);
               lt3.setText("* Enter only numeric digits");
            }
         }
      });
         
        
       label=new JLabel();     
      label.setBounds(510,355,200,25);   
       add(label);
       label.setForeground(Color.red);
       
       Qlabel=new JLabel();
       a1label=new JLabel();
       a2label=new JLabel();
       a3label=new JLabel();
       a4label=new JLabel();
      optionlabel=new JLabel();
      timinglabel = new JLabel();
      
        Qlabel.setBounds(950,140,200,25);
      a1label.setBounds(700,200,200,25);  
      a2label.setBounds(700,230,200,25);  
      a3label.setBounds(700,260,200,25);  
      a4label.setBounds(700,290,200,25); 
     optionlabel.setBounds(650,330,200,25);
     timinglabel.setBounds(650,385,200,25);
      
      add(Qlabel);
      add(a1label);
      add(a2label);
      add(a3label);
      add(a4label);
      add(optionlabel);
      add(timinglabel); 
       Qlabel.setForeground(Color.red);
       a1label.setForeground(Color.red);
       a2label.setForeground(Color.red);
       a3label.setForeground(Color.red);
       a4label.setForeground(Color.red);
       optionlabel.setForeground(Color.red);
       timinglabel.setForeground(Color.red);
       image4=new JLabel(new ImageIcon("D:\\01.jpg"));
       image4.setSize(screenSize.height,screenSize.width);
       add(image4); 
       
       tf.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = tf.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '1' && ke.getKeyChar() <= '4' || ke.getKeyChar()==8) {
               tf.setEditable(true);
               label.setText("");
            } else {
               tf.setEditable(false);
               label.setText("* Enter only numeric digits(0-4)");
            }
         }
      });
       b2.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
                 JOptionPane.showMessageDialog(rootPane,"     Test Created!"+"\n      Test id : "+Tablename);
                 new Login();
                 dispose();
             }
         });
      
        b1.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
              
           String time =ttf.getText();
            String Question = Qarea.getText();
            String Option1 = A1.getText();
            String Option2 = A2.getText();
            String Option3 = A3.getText();
            String Option4 = A4.getText();
            String COption = tf.getText();

              
          if(Question.isEmpty())
          {
              Qlabel.setText("*The field cannot be left blank");
          }
          
          else
          {
              Qlabel.setText("");
          }
            
          if(Option1.isEmpty())
          {
             a1label.setText("*The field cannot be left blank");
          }
           else
          {
              a1label.setText("");
          }
          
           if(Option2.isEmpty())
          {
             a2label.setText("*The field cannot be left blank");
          }
           else
          {
              a2label.setText("");
          }
           
            if(Option3.isEmpty())
          {
             a3label.setText("*The field cannot be left blank");
          }
           else
          {
              a3label.setText("");
          }
             if(Option4.isEmpty())
          {
             a4label.setText("*The field cannot be left blank");
          }
           else
          {
              a4label.setText("");
          }
             
          if(COption.isEmpty())
          {
             optionlabel.setText("*The field cannot be left blank");
          }
           else
          {
              optionlabel.setText("");
          }
          
               
          if(time.isEmpty())
          {
             timinglabel.setText("*The field cannot be left blank");
          }
           else
          {
              timinglabel.setText("");
          }
           if(Question.length()!=0 && Option1.length()!=0 && Option2.length()!=0 && Option3.length()!=0 && Option4.length()!=0 && COption.length()!=0 && time.length()!=0)    
           {               
             
            try{
           
            b2.setVisible(true);
            System.out.println(Question);
            System.out.println(Option1);
            System.out.println(Option2);
            System.out.println(Option3);
            System.out.println(Option4);
            System.out.println(COption);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
               
            String query = "insert into "+Tablename+" values('"+Question+"','"+Option1+"','"+Option2+"','"+Option3+"','"+Option4+"','"+COption+"',"+count+","+time+")";
        
            st.executeUpdate(query);
            con.setAutoCommit(true);
            con.close();
            System.out.println("Success!    ");

            Qarea.setText("");
            A1.setText("");
            A2.setText("");
            A3.setText("");
            A4.setText("");
            tf.setText("");
            ttf.setText("");
            
            Qlabel.setText("");
            a1label.setText("");
            a2label.setText("");
            a3label.setText("");
            a4label.setText("");
            optionlabel.setText("");
            timinglabel.setText("");
            
             count=count+1;
             
            }
            catch(Exception ex){
               
               JOptionPane.showMessageDialog(rootPane, ex.toString());
               
            }
           
                   }
                     
          l.setText("Enter Question "+count); 
        }
                 
             
         });
       
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setVisible(true);  
        
    }  
 }
 
 