import javax.swing.*;
import java.awt.*;
public class OptionpaneExample extends Frame
{

OptionpaneExample()
{
	setLayout(new FlowLayout());
String name;
JOptionPane.showMessageDialog("Order Successful","Message",JOptionPane.WARNING_MESSAGE);

}
public static void main(String args[])
{
OptionpaneExample f=new OptionpaneExample();
f.setSize(300,300);
f.show();
}
}
