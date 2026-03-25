package basicSwing;

import javax.swing.*;

public class DisplayImages {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Example");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon icon = new ImageIcon("D:\\BCA_3rd_sem\\New folder\\OOP_IN_JAVA\\Swing\\img\\manish.JPG");
        JLabel label = new JLabel(icon);

        frame.add(label);
        frame.setVisible(true);

    }   ;
}
