package eventHandling;
import javax.swing.*;
import java.awt.event.*;
public class MyActionEvent implements ActionListener{
    MyActionEvent()
    {
        JFrame frame= new JFrame("Button Clicks");
        frame.setSize(490,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button=new JButton("Click me");
        button.addActionListener(this);
        frame.add(button);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
    }
    public static void main(String[] args){
        new MyActionEvent();
    }
}