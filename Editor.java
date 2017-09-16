import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.net.URI;
public class Editor extends JFrame implements ActionListener,KeyListener
{
    JMenuBar mb;
    JMenu File,Edit,Help,Format;
    JMenuItem Cut,Copy,Paste,SelectAll,CharactersTyped,BgColor,CHelp,Exit;
    JTextArea t1;
JLabel l;

    Editor()
    {
        setLayout(new GridLayout(1,2));
        l=new JLabel();
        l.setBounds(20,50,100,20);
        Image icon=Toolkit.getDefaultToolkit().getImage("C:\\Users\\Vansh Madan\\Desktop\\downloa.png");
        setIconImage(icon);
        CharactersTyped=new JMenuItem("Characters typed");
        Cut=new JMenuItem("Cut");
        BgColor=new JMenuItem("Background Color");
        Copy=new JMenuItem("Copy");
        Paste=new JMenuItem("Paste");
        SelectAll=new JMenuItem("Select All");
        CHelp=new JMenuItem("Call for Help");
        Exit=new JMenuItem("Exit");
        CharactersTyped.addActionListener(this);
        Cut.addActionListener(this);
        Exit.addActionListener(this);
        Copy.addActionListener(this);
        Paste.addActionListener(this);
        SelectAll.addActionListener(this);
        BgColor.addActionListener(this);
        CHelp.addActionListener(this);
        mb=new JMenuBar();
        File=new JMenu("File");
        Edit=new JMenu("Edit");
        Format=new JMenu("Format");
        Help=new JMenu("Help");
        File.add("Character typed");
        File.addSeparator();
        File.add("Exit");
        Edit.add(Cut);
            Edit.addSeparator();
        Edit.add(Copy);
        Edit.addSeparator();
        Edit.add(Paste);
        Edit.addSeparator();
        Edit.add(SelectAll);
        Edit.addSeparator();
        Format.add(BgColor);
        Help.add(CHelp);
        mb.add(File);
        mb.add(Edit);
        mb.add(Format);
        mb.add(Help);


        t1=new JTextArea();


        t1.setBounds(5,5,360,320);
        add(t1);
        t1.addKeyListener(this);

        add(mb);
        setJMenuBar(mb);
        add(l);

        setVisible(true);
    }
    public void keyPressed(KeyEvent e)
 {
 l.setText("Key Pressed");
 }
 public void keyReleased(KeyEvent e)
 {
    l.setText("Key Released");
 }
 public void keyTyped(KeyEvent e)
 {
    l.setText("Key typed ");
 }
 public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== Exit)
        {
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }

        if (e.getSource() == Cut)
        {
            t1.cut();
        }
        if (e.getSource() == Paste)
        {
            t1.paste();
        }
        if (e.getSource() == Copy)
        {
            t1.copy();
        }
        if (e.getSource() == SelectAll)
        {
            t1.selectAll();
        }
        if (e.getSource() == BgColor)
        {
            Color c=JColorChooser.showDialog(this,"Choose",Color.CYAN);
            t1.setBackground(c);
        }
        if(e.getSource()== CHelp)
        {
            try
            {

                URI uri=new URI("https://www.google.co.in/?gfe_rd=cr&dcr=0&ei=yQO3WeKUNK6A8QfOhYH4CA");
                java.awt.Desktop.getDesktop().browse(uri);

            }
            catch (Exception et)
            {
                et.printStackTrace();
            }
        }

           }
    public static void main(String args[])
    {
        Editor F=new Editor();
        F.setSize(400,400);
        F.setVisible(true);
    }
}


