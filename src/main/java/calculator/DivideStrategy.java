package calculator;

public class DivideStrategy implements CalculateStrategy {

    @Override
    public double calculate(double right, double left) {
        return right / left;
    }
}
