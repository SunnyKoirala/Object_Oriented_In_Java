package calculatormvc;

public class CalculatorModel {
    private double result;

    public void calculate(double num1, double num2, String op){
        switch (op){
            case"+": result = num1 + num2; break;
            case"-": result = num1 - num2; break;
            case"*": result = num1 * num2; break;
            case"/": result = (num2 !=0) ? num1 / num2 : Double.NaN; break;
            default: result = 0;
        }
    }
    public double getResult(){
        return result;
    }
}
