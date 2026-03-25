package layoutManagers;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
       new FlowLayoutExample();
    }
}
