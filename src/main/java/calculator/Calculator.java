package calculator;

import java.util.HashMap;
import java.util.Map;

public class Calculator {

    private static Map<String, CalculateStrategy> bucket = new HashMap<>();

    static {
        bucket.put("+", new PlusStrategy());
        bucket.put("-", new MinusStrategy());
        bucket.put("*", new MultiplyStrategy());
        bucket.put("/", new DivideStrategy());
    }

    public static double run(double rightOperator, double leftOperator, String operand) {
        CalculateStrategy calculateStrategy = bucket.get(operand);
        return calculateStrategy.calculate(rightOperator, leftOperator);
    }
}
