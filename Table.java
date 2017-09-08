import javax.swing.*;
import java.awt.*;
public class Table extends JFrame
{
String data[][]={{"86","Vansh","500047452"},{"88","Lakshit","500047134"},{"84","Manu","500048411"},{"83","Yash","50048314"}};
String column[][]={{"Roll No","Name","Sap ID"}};
JTable jt=new JTable(data,column);

public Table()
{
	setLayout(new FlowLayout());
add(jt);
 jt.setBounds(30,40,200,300);   
}

public static void main(String args[])
{
Table F=new Table();
F.setSize(300,300);
F.show();
}
}



