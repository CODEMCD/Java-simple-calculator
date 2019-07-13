package calculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public class Calculator {

    private static Map<String, DoubleBinaryOperator> bucket = new HashMap<>();

    static {
        bucket.put("+", Double::sum);
        bucket.put("-", (a, b) -> a - b);
        bucket.put("*", (a, b) -> a * b);
        bucket.put("/", (a, b) -> a / b);
    }

    public static double run(double rightOperator, double leftOperator, String operand) {
        return bucket.get(operand).applyAsDouble(rightOperator, leftOperator);
    }
}
