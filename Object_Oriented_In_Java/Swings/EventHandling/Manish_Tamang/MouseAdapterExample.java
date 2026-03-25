package eventHandling;
import javax.swing.*;
import java.awt.event.*;
public class MouseAdapterExample extends JFrame {
    public MouseAdapterExample(){
        JLabel label= new JLabel("Click anywhere inside the window ");
        add(label);
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse clicked at X=" + e.getX() +", Y=" + e.getY());
            }
        });
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args){
        new MouseAdapterExample();
    }
}