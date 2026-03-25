package eventHandling;
import javax.swing.*;
import java.awt.event.*;
public class ItemEventExample extends JFrame implements ItemListener {
    JCheckBox cb;
    ItemEventExample(){
        cb= new JCheckBox("Accept Terms");
        cb.setBounds( 200 ,100,150,30);
        cb.addItemListener(this);
        add(cb);
        setSize(300,200);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemStateChanged(ItemEvent e){
        System.out.println(cb.isSelected() ? "checked" : "unchecked");
        new ItemEventExample();
    }
}