package layoutManagers;
import javax.swing.*;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    BoxLayoutExample() {
        setTitle("BoxLayout Example");
        JPanel panel=new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(new JButton("Button 1"));
        panel.add(new JButton("Button 2"));
        panel.add(new JButton("Button 3"));
        add(panel);
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new BoxLayoutExample();
    }
}

