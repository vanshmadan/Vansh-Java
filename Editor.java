import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Editor extends JFrame implements ActionListener
{
    JMenuBar mb;
    JMenu File,Edit,Help,Format;
    JMenuItem Cut,Copy,Paste,SelectAll,CharactersTyped,BgColor;
    JTextArea t1;


    Editor()
    {
        setLayout(null);
        CharactersTyped=new JMenuItem("Characters typed");
        Cut=new JMenuItem("Cut");
        BgColor=new JMenuItem("Background Color");
        Copy=new JMenuItem("Copy");
        Paste=new JMenuItem("Paste");
        SelectAll=new JMenuItem("Select All");
        CharactersTyped.addActionListener(this);
        Cut.addActionListener(this);
        Copy.addActionListener(this);
        Paste.addActionListener(this);
        SelectAll.addActionListener(this);
        BgColor.addActionListener(this);
        mb=new JMenuBar();
        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Format=new JMenu("Format");
        Help=new JMenu("Help");
        File.add("Character typed");
        Edit.add(Cut);
            Edit.addSeparator();
        Edit.add(Copy);
        Edit.addSeparator();
        Edit.add(Paste);
        Edit.addSeparator();
        Edit.add(SelectAll);
        Edit.addSeparator();
        Format.add(BgColor);
        mb.add(File);
        mb.add(Edit);
        mb.add(Format);
        mb.add(Help);


        t1=new JTextArea();


        t1.setBounds(5,5,360,320);
        add(t1);

        add(mb);
        setJMenuBar(mb);


        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == Cut) {
            t1.cut();
        }
        if (e.getSource() == Paste) {
            t1.paste();
        }
        if (e.getSource() == Copy) {
            t1.copy();
        }
        if (e.getSource() == SelectAll) {
            t1.selectAll();
        }
        if (e.getSource() == BgColor)
        {
            Color c=JColorChooser.showDialog(this,"Choose",Color.CYAN);
            t1.setBackground(c);
        }
    }
    public static void main(String args[])
    {
        Editor F=new Editor();
        F.setSize(400,400);
        F.setVisible(true);
    }
}


