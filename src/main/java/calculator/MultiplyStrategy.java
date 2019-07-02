package calculator;

public class MultiplyStrategy implements CalculateStrategy {

    @Override
    public double calculate(double right, double left) {
        return right * left;
    }
}
