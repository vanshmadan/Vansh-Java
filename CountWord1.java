import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CountWord1 extends JFrame implements  ActionListener
{
    JLabel l1,l2;
    JTextArea t1;
    JButton b1=new JButton("Click");
    JButton b2=new JButton("Pad Color");
    JButton b3=new JButton("tEXT Color");
    CountWord1() {
        setLayout(new GridLayout(2,2));
        l1 = new JLabel("Characters");
        l1.setBounds(50, 50, 100, 20);
        add(l1);

        l2 = new JLabel("Words");
        l2.setBounds(50, 80, 100, 20);
        add(l2);

        t1 = new JTextArea();
        t1.setBounds(100, 80, 200, 200);
        add(t1);

        add(b1);
        b1.addActionListener(this);


        add(b2);
        b2.addActionListener(this);


        add(b3);
        b3.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e)

    {
        if(e.getSource()==b1)
        {
            String text=t1.getText();
            l1.setText("Characters:" +text.length());
            String words[]=text.split("\\s");
            l2.setText("Words:" +words.length);
        }
        else if(e.getSource()==b2)
        {
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);
            t1.setBackground(c);
        }
        else if(e.getSource()==b3)
        {
            Color c=JColorChooser.showDialog(this,"Choose Color",Color.BLACK);
            t1.setForeground(c);
        }

    }
    public static void main(String args[])
    {
        CountWord1 f=new CountWord1();
        f.setSize(800,800);
        f.setVisible(true);

    }
}


