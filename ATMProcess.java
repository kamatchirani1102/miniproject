package miniproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ATMProcess implements ActionListener{
	   JLabel welcome,amt;
	   JFrame f;
	   JButton b1,b2,dep;
	   JTextField tamt;
	   static int getc=0,getp=0;
	   int acc_no[]= {100001,100002,100003,100004,100005};
	   int pin_no[]= {1234,1345,1567,2345,4567};
	   int amount[]= {18000,45000,50000,79000,4500};
	   Font font=new Font("SansSerif",Font.BOLD,20);
       ATMProcess()
       {
    	   f=new JFrame("ATM Process");
    	   f.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\SEENIVAS\\\\eclipse-workspace\\\\Practice\\\\src\\\\miniproject\\\\logo.jpeg")));
    	   Font font=new Font("SansSerif",Font.BOLD,20);
    	   welcome=new JLabel("Choose the Option");
    	   welcome.setFont(font);
    	   welcome.setBounds(20,30,200,30);
    	   b1=new JButton("Deposit");
    	   b1.setBackground(Color.GREEN);
    	   b1.setBounds(40,80,100,50);
    	   b1.addActionListener(new ActionListener() {
   			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				
   				if(e.getSource()==b1)
   				{
   					f.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\SEENIVAS\\\\eclipse-workspace\\\\Practice\\\\src\\\\miniproject\\\\deposit.jpeg")));
   					amt=new JLabel("Amount");
   					amt.setBounds(40,160,80,30);
   					f.add(amt);
   					tamt=new JTextField();
   					tamt.setBounds(90,160,80,30);
   					f.add(tamt);
   					dep=new JButton("ADD");
   					dep.setBounds(90,200,60,30);
   					f.add(dep);
   					dep.addActionListener(new ActionListener() {
   						
   						@Override
   						public void actionPerformed(ActionEvent e) {
   							
   							if(e.getSource()==dep)
   							{
   								int amt=Integer.parseInt(tamt.getText());
   			   					for(int i=0;i<acc_no.length;i++)
   			   					{
   			   						if(acc_no[i]==getc && pin_no[i]==getp)
   			   						{
   			   							amount[i]+=amt;
   			   							break;
   			   						}
   			   					}
   			   				JOptionPane.showMessageDialog(f,"Successfully updated");
   							}
   						}
   					});
   					
   				}
   			}
   		});

    	   b2=new JButton("WithDraw");
    	   b2.setBackground(Color.GREEN);
    	   b2.setBounds(150,80,100,50);
    	   b2.addActionListener(new ActionListener() {
   			
   			@Override
   			public void actionPerformed(ActionEvent e) {
   				
   				if(e.getSource()==b2)
   				{
   					f.setContentPane(new JLabel(new ImageIcon("C:\\\\Users\\\\SEENIVAS\\\\eclipse-workspace\\\\Practice\\\\src\\\\miniproject\\\\withdraw.jpeg")));
   					amt=new JLabel("Amount");
   					amt.setBounds(40,160,80,30);
   					f.add(amt);
   					tamt=new JTextField();
   					tamt.setBounds(90,160,80,30);
   					f.add(tamt);
   					dep=new JButton("Get");
   					dep.setBounds(90,200,60,30);
   					f.add(dep);
   					dep.addActionListener(new ActionListener() {
   						
   						@Override
   						public void actionPerformed(ActionEvent e) {
   							
   							if(e.getSource()==dep)
   							{
   								int amt=Integer.parseInt(tamt.getText());
   			   					for(int i=0;i<acc_no.length;i++)
   			   					{
   			   						if(acc_no[i]==getc && pin_no[i]==getp && amount[i]>amt)
   			   						{
   			   							amount[i]-=amt;
   			   							break;
   			   						}
   			   						else
   			   						{
   			   							JOptionPane.showMessageDialog(f,"Insufficient amount","Alert",JOptionPane.WARNING_MESSAGE);
   			   						}
   			   					}
   			   				JOptionPane.showMessageDialog(f,"Successfully withdrawn");
   							}
   						}
   					});	
   				}
   			}
   		});
    	   f.add(welcome);
    	   f.add(b1);
    	   f.add(b2);
    	   f.setSize(400,500);
    	   f.setLayout(null);
    	   f.setVisible(true);
    	   
       }
       static void getmethod(int getcard,int getpin)
       {
    	 getc=getcard; 
    	 getp=getpin;
       }
	public static void main(String[] args) {
		new ATMProcess();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
