package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestValidParenthesesTest {
    LongestValidParentheses problem;

    @BeforeEach
    public void before() {
        problem = new LongestValidParentheses();
    }

    @Test
    @DisplayName("input is \"(()\", output should be 2")
    public void determine() {
        int result = problem.longestValidParentheses("(()");
        assertEquals(2, result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            ")()()), 4",
            "\"\", 0",
            "(), 2",
            "()((), 2"
    })
    public void determine2(String input, int output) {
        int result = problem.longestValidParentheses(input);
        assertEquals(output, result);
    }
}