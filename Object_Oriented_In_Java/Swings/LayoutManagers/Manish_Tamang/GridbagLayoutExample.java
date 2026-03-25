package layoutManagers;
import javax.swing.*;
import java.awt.*;
public class GridbagLayoutExample extends JFrame {
    GridbagLayoutExample(){
        setTitle("GridBagLayout Example");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(b1, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(b2, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(b3, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(b4, gbc);
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new GridbagLayoutExample();
    }
}
