// Unit 11: GUI - Calculator Example
// Concept: Create interactive GUI with event handling

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {

    JTextField display;
    JButton[] numberButtons = new JButton[10];
    JButton addButton, subtractButton, multiplyButton, divideButton, equalsButton, clearButton;

    SimpleCalculator() {
        // Setup frame
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        // Create display
        display = new JTextField("0");
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setEditable(false);

        // Create number buttons
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create operation buttons
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        equalsButton.addActionListener(this);
        clearButton.addActionListener(this);

        // Add to panel
        add(display, BorderLayout.NORTH);

        // Add buttons
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(divideButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(multiplyButton);

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(subtractButton);

        panel.add(numberButtons[0]);
        panel.add(clearButton);
        panel.add(equalsButton);
        panel.add(addButton);

        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    // Handle button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            display.setText("0");
        } else if (command.equals("=")) {
            try {
                // Simple evaluation (not recommended in production)
                double result = eval(display.getText());
                display.setText(String.valueOf(result));
            } catch (Exception ex) {
                display.setText("Error");
            }
        } else {
            if (display.getText().equals("0")) {
                display.setText(command);
            } else {
                display.setText(display.getText() + command);
            }
        }
    }

    // Simple expression evaluator
    double eval(String expression) {
        return Double.valueOf(String.valueOf(new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < expression.length()) ? expression.charAt(pos) : -1;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < expression.length()) throw new RuntimeException("Unexpected: " + (char) ch);
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                while (ch == '+' || ch == '-') {
                    int op = ch;
                    nextChar();
                    double y = parseTerm();
                    if (op == '+') x += y;
                    else x -= y;
                }
                return x;
            }


            double parseTerm() {
                double x = parseFactor();
                while (ch == '*' || ch == '/') {
                    int op = ch;
                    nextChar();
                    double y = parseFactor();
                    if (op == '*') x *= y;
                    else x /= y;
                }
                return x;
            }


            double parseFactor() {
                if (ch == '-') {
                    nextChar();
                    return -parseFactor();
                }
                double x = 0;
                if (ch >= '0' && ch <= '9') {
                    while (ch >= '0' && ch <= '9') x = x * 10 + ch - '0';
                    nextChar();
                }
                return x;
            }
        }.parse()));
    }

    public static void main(String[] args) {
        System.out.println(" SIMPLE CALCULATOR GUI ");
        System.out.println("Creating calculator window...");
        System.out.println("Click buttons to perform calculations.\n");

        new SimpleCalculator();
    }
}
