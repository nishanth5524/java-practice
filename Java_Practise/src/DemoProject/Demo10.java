
package DemoProject;

import java.awt.*;  
import java.awt.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;  

class Demo10 extends JFrame implements ActionListener
{  
   
    JTextField A1,A2,A3,A4;  
    JButton b1,b2;
    JLabel l,al1,al2,al3,al4,optionl,label;
    JLabel Qlabel,a1label,a2label,a3label,a4label,optionlabel;
    JTextField Qarea,tf;
    int count=1;
 Demo10()  
    {  
       
        setLayout(null);
        
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
       b1.setBounds(620,400,100,30);  
       add(b1);
       b1.addActionListener(this);
       
        b2=new JButton("Done"); 
       b2.setBounds(820,400,100,30);
       add(b2);
       b2.setVisible(false);
       b2.addActionListener(this);
       
       
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
      
       Qlabel.setBounds(950,140,200,25);
      a1label.setBounds(700,200,200,25);  
      a2label.setBounds(700,230,200,25);  
      a3label.setBounds(700,260,200,25);  
      a4label.setBounds(700,290,200,25); 
     optionlabel.setBounds(650,330,200,25);
      
      add(Qlabel);
      add(a1label);
      add(a2label);
      add(a3label);
      add(a4label);
      add(optionlabel);
       
       Qlabel.setForeground(Color.red);
       a1label.setForeground(Color.red);
       a2label.setForeground(Color.red);
       a3label.setForeground(Color.red);
       a4label.setForeground(Color.red);
       optionlabel.setForeground(Color.red);
       
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
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
        setLocation(250,100);  
        setVisible(true);  
        setSize(900,500);  
    }  
 
  public void actionPerformed(ActionEvent ae){

        Object obj_source=ae.getSource();

        b2.setVisible(true);
        if(obj_source==b1){
            
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
             
           if(Question.length()!=0 && Option1.length()!=0 && Option2.length()!=0 && Option3.length()!=0 && Option4.length()!=0 && COption.length()!=0)    
           {               
             
            try{
           
            
            System.out.println(Question);
            System.out.println(Option1);
            System.out.println(Option2);
            System.out.println(Option3);
            System.out.println(Option4);
            System.out.println(COption);

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/faculty?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
            String query = "insert into qanda values('"+Question+"','"+Option1+"','"+Option2+"','"+Option3+"','"+Option4+"','"+COption+"',"+count+")";
        
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
            
            Qlabel.setText("");
            a1label.setText("");
            a2label.setText("");
            a3label.setText("");
            a4label.setText("");
            optionlabel.setText("");
            
             count=count+1;
            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex.toString());
            }
           
                   }
           else if(obj_source==b2){
                dispose();
            }
           
          l.setText("Enter Question "+count); 
        }
    }

  public static void main(String[] args)  
    {  
        new Demo10();  
    }  
    
}

