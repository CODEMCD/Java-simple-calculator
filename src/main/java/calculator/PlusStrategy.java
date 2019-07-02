package calculator;

public class PlusStrategy implements CalculateStrategy {

    @Override
    public double calculate(double right, double left) {
        return right + left;
    }
}
