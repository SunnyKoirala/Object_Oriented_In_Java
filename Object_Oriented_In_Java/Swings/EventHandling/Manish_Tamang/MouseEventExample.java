package eventHandling;

import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class MouseEventExample implements MouseListener {

    public MouseEventExample() {
        JFrame frame = new JFrame("MouseEvent Example");
        JButton b = new JButton("Hover and Click");

        b.addMouseListener(this);

        frame.add(b);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}