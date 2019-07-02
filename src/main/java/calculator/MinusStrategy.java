package calculator;

public class MinusStrategy implements CalculateStrategy {

    @Override
    public double calculate(double right, double left) {
        return right - left;
    }
}
