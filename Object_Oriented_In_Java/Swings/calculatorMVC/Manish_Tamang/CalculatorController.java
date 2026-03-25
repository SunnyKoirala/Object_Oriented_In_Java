package calculatormvc;

import java.awt.event.*;
import javax.swing.*;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel m, CalculatorView v){
        this.model = m;
        this.view = v;

        view.btnCalc.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e)
            {
                performCalculation();
            }
        });

    }

    private void performCalculation() {
        try {
            double num1 = Double.parseDouble(view.getNum1());
            double num2 = Double.parseDouble(view.getNum2());
            String op = view.getOperator();

            model.calculate(num1, num2, op);
            view.setResult(String.valueOf(model.getResult()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please enter valid numbers!");
        }
    }

}
