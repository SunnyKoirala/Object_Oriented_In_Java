package basicSwing;

import javax.swing.*;
import java.awt.*;
public class creating2DImage {

    public static void main(String[] args){
        JFrame frame = new JFrame("2D shapes Example");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(){
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                g.drawRect(50, 50, 100, 50); //Rectangle
                g.drawOval(200, 50, 100, 50); //Oval
                g.drawLine(50, 150, 300, 150); //Line
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}
