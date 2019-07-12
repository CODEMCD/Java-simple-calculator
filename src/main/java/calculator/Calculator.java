package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static Map<String, CalculateStrategy> bucket = new HashMap<>();

    static {
        bucket.put("+", new CalculateStrategy() {
            @Override
            public double calculate(double right, double left) {
                return right + left;
            }
        });
        bucket.put("-", new CalculateStrategy() {
            @Override
            public double calculate(double right, double left) {
                return right - left;
            }
        });
        bucket.put("*", new CalculateStrategy(){
            @Override
            public double calculate(double right, double left) {
                return right * left;
            }
        });
        bucket.put("/", new CalculateStrategy() {
            @Override
            public double calculate(double right, double left) {
                return right / left;
            }
        });
    }

    public static double run(double rightOperator, double leftOperator, String operand) {
        CalculateStrategy calculateStrategy = bucket.get(operand);
        return calculateStrategy.calculate(rightOperator, leftOperator);
    }
}
