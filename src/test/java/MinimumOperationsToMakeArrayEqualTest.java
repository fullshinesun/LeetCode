import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToMakeArrayEqualTest {
    MinimumOperationsToMakeArrayEqual problem;

    @BeforeEach
    public void before() {
        problem = new MinimumOperationsToMakeArrayEqual();
    }

    @Test
    @DisplayName("input is 3, output should be 2")
    public void minOpTest() {
        int result = problem.minOperations(3);
        assertEquals(2, result, "if n is 3, then output is 2");
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            "3, 2",
            "4, 4",
            "5, 6",
            "6, 9"
    })
    public void minOpTest2(int input, int output) {
        int result = problem.minOperations(input);
        assertEquals(output, result);
    }
}