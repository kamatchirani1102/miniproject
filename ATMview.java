package miniproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ATMview implements ActionListener {
       JButton b,b2;
       JFrame f;
       public ATMview()
       {
    	   f=new JFrame("ATM");
    	   JLabel welcome=new JLabel("Welcome To ATM");
    	   Font font=new Font("SansSerif",Font.BOLD,50);
           welcome.setFont(font);
           welcome.setBounds(400,130,500,40);
           welcome.setForeground(Color.RED);
          f.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\SEENIVAS\\\\eclipse-workspace\\\\Practice\\\\src\\\\miniproject\\\\logo.jpeg")));
          b=new JButton("Login");
          Font font1=new Font("SansSerif",Font.BOLD,30);
          b.setFont(font1);
          b.setBackground(Color.CYAN);
          b.setBounds(400,650,200,50); 
          b.addActionListener(this);
          b2=new JButton("Close");
          b2.setFont(font1);
          b2.setBackground(Color.CYAN);
          b2.setBounds(600,650,200,50);
          b2.addActionListener(this);
           
    	   
    	   f.add(welcome);
    	   f.add(b);
    	   f.add(b2);
    	   f.setSize(300,300);
    	   f.setVisible(true);
       }
       
      
	public static void main(String[] args) {
		 new ATMview();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b)
		{
			ATMLogin obj=new ATMLogin();
		}
		if(e.getSource()==b2)
		{
			f.dispose();
		}
	}

}
