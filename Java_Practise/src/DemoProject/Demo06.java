
package DemoProject;

import java.awt.*;  
import java.awt.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;  

class Demo06 extends JFrame 
{  
   
    JTextField A[]=new JTextField[5];  
    JButton b1;
    JLabel l,al1,al2,al3,al4,optionl,label;
    JTextField Qarea,tf;

 Demo06()  
    {  
        setLayout(null);
        
        l=new JLabel("Enter Question: ");
        l.setBounds(30,40,450,40); 
        add(l);
        
        Qarea=new JTextField();  
        Qarea.setBounds(130,40,450,40);  
        add(Qarea);  
                
       al1=new JLabel("Enter Option 1: ");
       al2=new JLabel("Enter Option 2: ");
       al3=new JLabel("Enter Option 3: ");
       al4=new JLabel("Enter Option 4: ");
       
       al1.setBounds(30,100,100,20);  
       al2.setBounds(30,130,100,20);  
       al3.setBounds(30,160,100,20);  
       al4.setBounds(30,190,100,20);  
       
       add(al1);
       add(al2);
       add(al3);
       add(al4);
       
       for(int i=0;i<5;i++)  
        {  
            A[i]=new JTextField();     
            add(A[i]);  
              
        }
       
       A[0].setBounds(130,100,200,25);  
       A[1].setBounds(130,130,200,25);  
       A[2].setBounds(130,160,200,25);  
       A[3].setBounds(130,190,200,25);  
       
       optionl=new JLabel("Enter Correct Option: ");
       optionl.setBounds(30,235,210,18);
       add(optionl);
       
       tf=new JTextField();
       tf.setBounds(160,230,120,25);
       add(tf);
       
       b1=new JButton("next"); 
       b1.setBounds(260,300,100,30);  
       add(b1);
       
       label=new JLabel(); 
       label.setBounds(160,210,220,125);  
       add(label);
       label.setForeground(Color.red);

       tf.addKeyListener(new KeyAdapter() {
         public void keyPressed(KeyEvent ke) {
            String value = tf.getText();
            int l = value.length();
            if (ke.getKeyChar() >= '1' && ke.getKeyChar() <= '4') {
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
        setSize(700,450);  
    }  
 
  public static void main(String[] args)  
    {  
        new Demo06();  
    }  
    
}
