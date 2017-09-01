import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

public class mychoice1 extends JFrame implements ActionListener
{
JLabel l1=new JLabel("Enter first number");
JTextField t1= new JTextField(20);
JLabel l2=new JLabel("Enter second number");
JTextField t2=new JTextField(20);
JLabel l3=new JLabel("Operator");
String[] operate={"Addition","Subtraction","Division","Multiplication"};
JComboBox ch=new JComboBox(operate);
JLabel l4=new JLabel("Result");
TextField t4=new TextField(20);
JButton b1=new JButton("OK");
JButton b2=new JButton("Exit");

int n1,n2;
float s;
String operator[]={"Addition","Subtraction","Division","Multiplication"};

public mychoice1()
{
	setLayout(new FlowLayout());
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);

add(ch);
add(l4);
add(t4);
add(b1);
b1.addActionListener(this);
add(b2);
b2.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
  n1=Integer.parseInt(t1.getText());
   n2=Integer.parseInt(t2.getText());
   String op;
   op=(String)ch.getSelectedItem();
   if(op=="Addition")
   {
   s=n1+n2;
   }
   else if(op=="Multiplication")
   {
   s=n1*n2;
   }
   else if(op=="Division")
   {
   s=n1/n2;
   }
   else if(op=="Subtraction")
   {
   s=n1-n2;
   }
   t4.setText(String.valueOf(s));
}
else if(e.getSource()==b2)
{
  System.exit(0);
}
  }
  public static void main(String args[])
  {
  mychoice1 F=new mychoice1();
  F.setSize(400,400);
  F.show();
  }
  }


   
   