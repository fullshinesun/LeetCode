package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllAdjacentDuplicatesInString2Test {
    RemoveAllAdjacentDuplicatesInString2 problem;

    @BeforeEach
    public void before() {
        problem = new RemoveAllAdjacentDuplicatesInString2();
    }

    @Test
    public void determine() {
        String result = problem.removeDuplicates("deeedbbcccbdaa", 3);
        assertEquals("aa", result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0} and {1}, output should be {2}")
    @CsvSource({
            "abcd, 2, abcd",
            "pbbcggttciiippooaais, 2, ps"
    })
    public void determine2(String input1, int input2, String output) {
        String result = problem.removeDuplicates(input1, input2);
        assertEquals(output, result);
    }
}