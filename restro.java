import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class restro extends Frame implements ActionListener
{
	
int amt=0,p=0,b=0,s=0,cd=0;

JLabel l1,l2,l3;
    JCheckBox cb1=new JCheckBox("Pizaa @ 100");
	JCheckBox cb2=new JCheckBox("Burger @ 60");
	JCheckBox cb3=new JCheckBox("Sandwich @ 60");
	JCheckBox cb4=new JCheckBox("Cold drink @ 40");
JTextField t1;
JButton b1,b2;
JRadioButton r1=new JRadioButton("Cash");
JRadioButton r2=new JRadioButton("Card");

restro()
{
	setLayout(new FlowLayout());
l1=new JLabel("Food to order:");
l3=new JLabel("Payment:");
l2=new JLabel("Order Amount:");
t1=new JTextField(20);
b1=new JButton("Ok");
b2=new JButton("Exit");
add(l1);
add(cb1);
add(cb2);
add(cb3);
add(cb4);
add(l3);
add(r1);
add(r2);
add(l2);
add(t1);
add(b1);
b1.addActionListener(this);
add(b2);

b2.addActionListener(this);
}





public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b2)
{
System.exit(0);
}
if(e.getSource()==b1)
	
{
	    if(cb1.isSelected())
		{  
           p=100; 
        }
		else
		{
			p=0;
		}
		
        if(cb2.isSelected())
		{  
            b=60;  
        }  
		else
		{
		b=0;
		}
		
        if(cb3.isSelected())
		{  
            s=60;			
        } 
		else 
		{
			s=0;
		}
		if(cb4.isSelected())
		{
			cd=40;
		}
		else
		{
			cd=0;
		}
}

amt=p+b+s+cd;
if(r1.isSelected())
{
	amt=this.amt;
}
else if(r2.isSelected())
{
	amt=amt-(amt*10/100);
}
t1.setText(String.valueOf(amt));
}

public static void main(String args[])
{
restro f=new restro();
f.setSize(400,400);
f.show();
}
}

