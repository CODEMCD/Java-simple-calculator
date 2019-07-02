package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    @Test
    void 더하기_Test() {
        assertThat(Calculator.run(1.0, 2.0, "+")).isEqualTo(3.0);
    }

    @Test
    void 빼기_Test() {
        assertThat(Calculator.run(1.0, 2.0, "-")).isEqualTo(-1.0);
    }

    @Test
    void 곱하기_Test() {
        assertThat(Calculator.run(1.0, 2.0, "*")).isEqualTo(2.0);
    }

    @Test
    void 나누기_Test() {
        assertThat(Calculator.run(1.0, 2.0, "/")).isEqualTo(0.5);
    }
}
