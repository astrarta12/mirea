package lab27.ex1;

public class CalculatorController {

    private CalculatorModel calculator;
    private lab27.ex1.CalculatorView calculatorView;

    public CalculatorController(CalculatorModel calculator, lab27.ex1.CalculatorView calculatorView) {
        this.calculator = calculator;
        this.calculatorView = calculatorView;
    }

    public void calculate() {
        try {
            String expression = calculatorView.getExpression();
            int result = calculator.calculate(expression);
            calculatorView.printResult(result);
        } catch (Exception e) {
            calculatorView.printException(e);
        }
    }

    public static void main(String[] args) {
        new CalculatorController(
                new CalculatorModel(),
                new lab27.ex1.CalculatorView()
        ).calculate();
    }

}
