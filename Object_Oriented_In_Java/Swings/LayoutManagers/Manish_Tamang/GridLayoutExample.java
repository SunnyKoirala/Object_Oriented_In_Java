package layoutManagers;
import javax.swing.*;
import java.awt.*;
public class GridLayoutExample extends JFrame {
    GridLayoutExample(){
        setTitle("GridLayoutExample");
        setLayout(new GridLayout(2, 3));
        for (int i =1; i < 6; i++) {
            add(new JButton("Button"+i));
        }
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args){
        new GridLayoutExample();
    }
}
