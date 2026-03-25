package eventHandling;
import javax.swing.*;
import java.awt.event.*;
public class ActionEvent2 {
    public static void main(String[] args){
        JFrame frame= new JFrame("Button Clicks");
        frame.setSize(490,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button=new JButton("Click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked");
            }
        });
        frame.add(button);
        frame.setVisible(true);
    }
}