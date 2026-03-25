package calculatormvc;
import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {
    JTextField t1 = new JTextField(10);
    JTextField t2 = new JTextField(10);
    JComboBox<String> operator = new JComboBox<>(new String[]{"+", "-", "*", "/"});
    JButton btnCalc = new JButton("calculate");
    JTextField resultField = new JTextField(10);

    public CalculatorView(){
        setTitle("MVC Calculator");
        setLayout(new GridLayout(4, 1, 5, 5));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Row 1: Number 1
        JPanel p1 = new JPanel(new FlowLayout());
        p1.add(new JLabel("First Number:"));
        p1.add(t1);
        add(p1);

        // Row 2: Number 2
        JPanel p2 = new JPanel(new FlowLayout());
        p2.add(new JLabel("Second Number:"));
        p2.add(t2);
        add(p2);

        // Row 3: Operator and Button
        JPanel p3 = new JPanel(new FlowLayout());
        p3.add(new JLabel("Operation:"));
        p3.add(operator);
        p3.add(btnCalc);
        add(p3);

        // Row 4: Result
        JPanel p4 = new JPanel(new FlowLayout());
        p4.add(new JLabel("Result:"));
        p4.add(resultField);
        add(p4);

        resultField.setEditable(false);
        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getNum1()
    {
        return t1.getText();
    }
    public String getNum2()
    {
        return t2.getText();
    }
    public String getOperator()
    {
        return (String) operator.getSelectedItem();
    }
    public void setResult(String res)
    {
        resultField.setText(res);
    }
}