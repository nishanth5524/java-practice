
package DemoProject;

import java.awt.*;  
import java.awt.event.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;  
  
class Demo05 extends JFrame implements ActionListener
{  
   
    JTextField A[]=new JTextField[5];  
    JButton b1;
    JLabel l,al1,al2,al3,al4,label,optionl;
    JTextField Qarea,tf;

    int count=0;
    int current=0;
 Demo05()  
    {  
        
         Qarea=new JTextField();  
        Qarea.setBounds(130,40,450,40);  
        add(Qarea);  
        
        for(int i=0;i<5;i++)  
        {  
            A[i]=new JTextField();     
            add(A[i]);  
              
        }  
        b1=new JButton("next");  
       // b2=new JButton("next");  
       b1.addActionListener(this);  
       // b2.addActionListener(this);  
        add(b1);
       // add(b2);  
       
        
       l=new JLabel("Enter Question: ");
       add(l);
       
        al1=new JLabel("Enter Option 1: ");
        al2=new JLabel("Enter Option 2: ");
        al3=new JLabel("Enter Option 3: ");
        al4=new JLabel("Enter Option 4: ");
        
        label=new JLabel();
        optionl=new JLabel("Enter Correct Answer ");
        
         add(al1);
         add(al2);
         add(al3);
         add(al4);
         
         add(optionl);
         
         add(label);
         
       
     
     Container container = getContentPane();
     // setBounds(0, 0, 500, 300);
      tf = new JTextField(25);
     
      container.add(new JLabel());
      container.add(tf);
      container.add(label = new JLabel());
      label.setForeground(Color.red);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
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
         
        
        al1.setBounds(30,100,100,20);  
        al2.setBounds(30,130,100,20);  
        al3.setBounds(30,160,100,20);  
        al4.setBounds(30,190,100,20);  
        label.setBounds(160,260,200,40);
        
        l.setBounds(30,40,450,40); 
        
        A[0].setBounds(130,100,200,25);  
        A[1].setBounds(130,130,200,25);  
        A[2].setBounds(130,160,200,25);  
        A[3].setBounds(130,190,200,25);  
        
      tf.setBounds(160,230,120,25);
        
        b1.setBounds(260,300,100,30);  
       // b2.setBounds(270,240,100,30);
       
       optionl.setBounds(30,235,210,10);
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setLocation(250,100);  
        setVisible(true);  
        setSize(700,450);  
    }  
 
  public void actionPerformed(ActionEvent e)  
    {  
        if(e.getSource()==b1)  
        {  
            
                count=count+1;  
                
                insertvalue();
             
        }  
        
    }  
  
   void insertvalue(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo?zeroDateTimeBehavior=convertToNull","root","");
            Statement  st = con.createStatement();
            String query = "delete from userdata where id=5;";
        
        st.executeUpdate(query);
        con.setAutoCommit(true);
            con.close();
            System.out.println("Success!    ");
        }
        catch(Exception e){
            System.out.println("---------->  "+e);
        }
    }

  public static void main(String[] args)  
    {  
        new Demo05();  
    }  
    
}
