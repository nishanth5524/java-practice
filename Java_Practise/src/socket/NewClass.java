/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class NewClass{
    
    public static void register()
    {
        Font font_1=new Font("Calibri",Font.PLAIN,16);
        Font font_2=new Font("SanSerif",Font.BOLD,20);
        JFrame f=new JFrame(); 
        f.getContentPane().setBackground(Color.PINK);
        f.getContentPane().setForeground(Color.PINK);
        f.setTitle("Registrartion form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel l_reg=new JLabel("REGISTRATION");
        l_reg.setBackground(Color.BLACK);
        l_reg.setForeground(Color.black);
        JLabel l_user=new JLabel("USERNAME");
        l_user.setBackground(Color.BLACK);
        l_user.setForeground(Color.BLACK);
        JLabel l_pass=new JLabel("PASSWORD");
        l_pass.setBackground(Color.BLACK);
        l_pass.setForeground(Color.black);
        JLabel l_retype=new JLabel("RE-TYPE PASSWORD");
        l_retype.setBackground(Color.BLACK);
        l_retype.setForeground(Color.black);
        JLabel l_phno=new JLabel("PH.NO");
        l_phno.setBackground(Color.BLACK);
        l_phno.setForeground(Color.black);
        JLabel l_mail=new JLabel("MAIL-ID");
        l_mail.setBackground(Color.BLACK);
        l_mail.setForeground(Color.black);
        JLabel l_msg=new JLabel();
        
        JTextField t_user=new JTextField();
        JTextField t_pass=new JTextField();
        JTextField t_retype=new JTextField();
        JTextField t_phno=new JTextField();
        JTextField t_mail=new JTextField();
        
        JButton b_reg=new JButton("Register");
        b_reg.setBackground(Color.ORANGE);
        b_reg.setForeground(Color.black);
        
        f.setSize(600, 600);
        f.setVisible(true);
        f.setLayout(null);
        
        l_reg.setBounds(210,80,200,30);
        l_user.setBounds(130,150,100,30);
        l_pass.setBounds(130,190,100,30);
        l_retype.setBounds(130, 230, 150, 30);
        l_phno.setBounds(130, 270, 100, 30);
        l_mail.setBounds(130, 310, 100, 30);
        l_msg.setBounds(165,400,270,30);
        l_msg.setBackground(Color.BLACK);
		l_msg.setForeground(Color.black);
		

        l_reg.setFont(font_2);
        l_user.setFont(font_1);
        l_pass.setFont(font_1);
        l_retype.setFont(font_1);
        l_phno.setFont(font_1);
        l_mail.setFont(font_1);
        l_msg.setFont(font_1);
        
        t_user.setBounds(290, 150, 200, 30);
        t_pass.setBounds(290, 190,200, 30);
        t_retype.setBounds(290, 230, 200, 30);
        t_phno.setBounds(290, 270, 200, 30);
        t_mail.setBounds(290,310,200,30);
        
        t_user.setFont(font_1);
        t_pass.setFont(font_1);
        t_retype.setFont(font_1);
        t_phno.setFont(font_1);
        t_mail.setFont(font_1);

        b_reg.setBounds(230,370,100, 30);
        b_reg.setFont(font_1);
        
        f.add(l_reg);
        f.add(l_user);
        f.add(l_pass);
        f.add(l_retype);
        f.add(l_phno);
        f.add(l_mail);
        f.add(t_user);
        f.add(t_pass);
        f.add(t_retype);
        f.add(t_phno);
        f.add(t_mail);
        f.add(b_reg);
        f.add(l_msg);
        
        int x,y;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        x  = (int) ((screenSize.getWidth() - f.getWidth()) / 2);
        y = (int) ((screenSize.getHeight() - f.getHeight()) / 2);
        f.setLocation(x, y);
    }
    public static void main(String args[])
    {
        register();
    }
}
