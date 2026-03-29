// Unit 11: Book Questions - GUI Practice
// Concept: Create simple GUI applications with Swing

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

        // Simple login form GUI
public class LoginForm extends JFrame implements ActionListener {

    JTextField emailField;
    JPasswordField passwordField;
    JButton loginButton, clearButton;
    JLabel resultLabel;

    LoginForm() {
        setTitle("Login Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Email label and field
        JLabel emailLabel = new JLabel("Email:");
        emailField = new JTextField();
        panel.add(emailLabel);
        panel.add(emailField);

        // Password label and field
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // Buttons
        loginButton = new JButton("Login");
        clearButton = new JButton("Clear");
        loginButton.addActionListener(this);
        clearButton.addActionListener(this);
        panel.add(loginButton);
        panel.add(clearButton);

        // Result label
        resultLabel = new JLabel("Status: Ready");
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if (email.isEmpty() || password.isEmpty()) {
                resultLabel.setText("Status: Fill all fields!");
            } else {
                resultLabel.setText("Status: Login successful!");
            }
        } else if (e.getSource() == clearButton) {
            emailField.setText("");
            passwordField.setText("");
            resultLabel.setText("Status: Cleared");
        }
    }
}

// Temperature converter GUI
class TemperatureConverter extends JFrame implements ActionListener {

    JTextField celsiusField, fahrenheitField;
    JButton convertButton;

    TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusField = new JTextField();
        panel.add(celsiusLabel);
        panel.add(celsiusField);

        JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
        fahrenheitField = new JTextField();
        fahrenheitField.setEditable(false);
        panel.add(fahrenheitLabel);
        panel.add(fahrenheitField);

        convertButton = new JButton("Convert");
        convertButton.addActionListener(this);
        panel.add(convertButton);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9 / 5) + 32;
            fahrenheitField.setText(String.format("%.2f", fahrenheit));
        } catch (NumberFormatException ex) {
            fahrenheitField.setText("Invalid input");
        }
    }
}

// Grade calculator and result displayer
class GradeCalculator extends JFrame implements ActionListener {

    JTextField marksField;
    JLabel gradeLabel, resultLabel;
    JButton calculateButton;

    GradeCalculator() {
        setTitle("Grade Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel marksLabel = new JLabel("Enter Marks (0-100):");
        marksField = new JTextField();
        panel.add(marksLabel);
        panel.add(marksField);

        gradeLabel = new JLabel("Grade:");
        JLabel emptyLabel = new JLabel("");
        panel.add(gradeLabel);
        panel.add(emptyLabel);

        calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(this);
        panel.add(calculateButton);

        resultLabel = new JLabel("Result: Enter marks and click Calculate");
        resultLabel.setForeground(Color.BLUE);
        panel.add(resultLabel);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int marks = Integer.parseInt(marksField.getText());

            String grade;
            if (marks >= 90) grade = "A+ (Excellent)";
            else if (marks >= 80) grade = "A (Very Good)";
            else if (marks >= 70) grade = "B (Good)";
            else if (marks >= 60) grade = "C (Average)";
            else if (marks >= 50) grade = "D (Pass)";
            else grade = "F (Fail)";

            gradeLabel.setText("Grade: " + grade);
            resultLabel.setText("Result: " + grade);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input!");
        }
    }
}

// Main class to run all questions
public class BookQuestions {

    public static void main(String[] args) {
        System.out.println(" GUI APPLICATIONS ");
        System.out.println("QUESTION 1: Login Form");
        new LoginForm();

        System.out.println("QUESTION 2: Temperature Converter");
        new TemperatureConverter();

        System.out.println("QUESTION 3 & 4: Grade Calculator");
        new GradeCalculator();

        System.out.println("All GUI windows opened!");
    }
}
