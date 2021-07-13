package miniproject;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ATMLogin implements ActionListener {
      JFrame f;
      JLabel welcome,ac,pin;
      JTextField taccno,tpin;
      JButton login;
      int acc_no[]= {100001,100002,100003,100004,100005};
	  int pin_no[]= {1234,1345,1567,2345,4567};
	  int amount[]= {18000,45000,50000,79000,4500};
      ATMLogin()
      {
    	  f=new JFrame("Login");
    	  f.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\SEENIVAS\\\\eclipse-workspace\\\\Practice\\\\src\\\\miniproject\\\\logo.jpeg")));
    	  welcome=new JLabel("WELCOME");
   	      welcome.setBounds(20,50,100,20);
   	      f.add(welcome);
   	      ac=new JLabel("Card_No");
	      ac.setBounds(50,150,80,30);
		  f.add(ac);
		  taccno=new JTextField();
		  taccno.setBounds(150,150,200,40);
		  f.add(taccno);
		  pin=new JLabel("PIN_NO");
		  pin.setBounds(50,200,80,30);
		  f.add(pin);
		  tpin=new JTextField();
		  tpin.setBounds(150,200,200,40);
		  f.add(tpin);
		  login=new JButton("Login");
		  login.setBounds(150,250,80,30);
		  login.setBackground(Color.MAGENTA);
		  login.addActionListener(this);
				  
		  f.add(login);
    	  f.setSize(400,500);
   	      f.setLayout(null);
   	      f.setVisible(true);
    	  
      }
      
      
	public static void main(String[] args) {
		new ATMLogin();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==login)
		 {
			 int getcard=Integer.parseInt(taccno.getText());
			 int getpin=Integer.parseInt(tpin.getText());
			 for(int i=0;i<acc_no.length;i++)
			 {
				 if(getcard==acc_no[i] && getpin==pin_no[i] )
				 {
					 ATMProcess obj=new ATMProcess();
					 obj.getmethod(getcard,getpin);
					 break;
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(f,"Invalid card_no or pin_no","Alert",JOptionPane.WARNING_MESSAGE); 
				 }
			 }
		 }
		}
	}
