import javax.swing.*;
import java.awt.*;



public class DrawGraphics extends Canvas {
    public void paint(Graphics g) {

        g.drawString("Rectangle", 50, 40);
        setBackground(Color.CYAN);

        g.drawRect(30,50,100,120);

        g.fillRect(30,50,100,120);
        g.drawString("Oval",180,40);
        g.drawOval(180,50,100,120);
        setForeground(Color.MAGENTA);
        g.fillOval(180,50,100,120);

    }

    public static void main(String args[]) {

        DrawGraphics m = new DrawGraphics();
        JFrame f=new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
