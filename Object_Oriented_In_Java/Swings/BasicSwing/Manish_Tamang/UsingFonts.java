package basicSwing;

import javax.swing.*;
import java.awt.*;
public class UsingFonts {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Example");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setFont(new Font("Serif", Font.ITALIC, 24 ));
                g.drawString("Hello, Swing!", 100, 100);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}