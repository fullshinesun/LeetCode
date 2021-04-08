import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetermineIfStringHalvesAreAlikeTest {
    DetermineIfStringHalvesAreAlike problem;

    @BeforeEach
    public void before() {
        problem = new DetermineIfStringHalvesAreAlike();
    }


    @Test
    @DisplayName("input is \"book\", output should be true")
    public void determine() {
        boolean result = problem.halvesAreAlike("book");
        assertTrue(result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            "book, true",
            "MerryChristmas, false",
            "AbCdEfGh, true",
    })
    public void determine2(String input, boolean output) {
        boolean result = problem.halvesAreAlike(input);
        assertEquals(output, result);
    }
}