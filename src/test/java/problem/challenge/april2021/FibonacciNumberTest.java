package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberTest {
    FibonacciNumber problem;

    @BeforeEach
    public void before() {
        problem = new FibonacciNumber();
    }

    @Test
    @DisplayName("input is 4, output should be 3")
    public void minOpTest() {
        int result = problem.fib(4);
        assertEquals(3, result);
    }

    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            "0, 0",
            "1, 1",
            "2, 1",
            "3, 2",
            "4, 3",
            "28, 317811",
            "29, 514229",
            "30, 832040",
    })
    public void minOpTest2(int input, int output) {
        int result = problem.fib(input);
        assertEquals(output, result);
    }
}
