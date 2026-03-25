package basicSwing;

import javax.swing.*;
public class JLavelExample {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame("Adding Information to the Container");
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label=new JLabel("Hello Swing");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
