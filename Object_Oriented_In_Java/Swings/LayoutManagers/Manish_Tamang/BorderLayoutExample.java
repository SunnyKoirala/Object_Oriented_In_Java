package layoutManagers;
import javax.swing.*;
import java.awt.*;
public class BorderLayoutExample extends JFrame {
    BorderLayoutExample(){
        setTitle("BorderLayout Example");
        setLayout(new BorderLayout());
        add(new JButton("NORTH"), BorderLayout.NORTH);
        add(new JButton("SOUTH"), BorderLayout.SOUTH);
        add(new JButton("EAST"), BorderLayout.EAST);
        add(new JButton("WEST"), BorderLayout.WEST);
        add(new JButton("CENTER"), BorderLayout.CENTER);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new BorderLayoutExample();
    }
}
