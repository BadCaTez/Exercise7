import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public void paint(Graphics g){
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g.setColor(Color.gray);
        g.fillOval(255,150,50,50);
        g.setColor(Color.darkGray);
        g.fillOval(260,195,50,50);
        g.fillOval(255,235,60,60);
        g.setColor(Color.WHITE);
        g.fillRect(253,195,30,100);
        g.fillOval(285,165,9,17);
        g.setColor(Color.black);
        g.drawOval(285,165,9,17);
        g.drawOval(285,168,9,10);
        g.fillOval(287,169,5,8);
        g.setColor(Color.darkGray);
        g2.setStroke(new BasicStroke(4));
        g2.drawLine(295,225,335,195);
        g2.drawLine(335,195,332,173);
        g2.drawLine(332,173,335,172);
        g2.drawLine(295,230,335,235);
        g2.drawLine(335,235,343,226);
        g2.drawLine(343,226,350,228);
        g2.drawLine(295,255,310,300);
        g2.drawLine(310,300,305,315);
        g2.drawLine(305,315,313,315);
        g2.drawLine(285,265,300,307);
        g2.drawLine(300,307, 297,313);
        g2.drawLine(297,313,300,313);
        g2.drawLine(285,226, 250, 225);
        g2.drawLine(250, 225,265,205);
        g2.drawLine(265,205, 260,202);
        g2.drawLine(285,236,257,242);
        g2.drawLine(257,242,240,260);
        g2.drawLine(240,260,243,245);
        g2.setStroke(new BasicStroke(2));

        g2.drawLine(300,180,310,150);
        g2.drawLine(310,150,310,140);
        g2.drawLine(310,140,315,135);

        g2.drawLine(295,185,300,145);
        g2.drawLine(300,145,290,140);
        g2.drawLine(290,140,285,135);
    }

    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        super("Задание7");
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
}
