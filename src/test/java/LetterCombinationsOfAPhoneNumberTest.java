import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void determine() {
        List<String> result = LetterCombinationsOfAPhoneNumber.letterCombinations("book");
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            ", []",
//            "2, [a",]",
    })
    public void determine2(String input, boolean output) {
        List<String> result = LetterCombinationsOfAPhoneNumber.letterCombinations(input);
        assertEquals(output, result);
    }
}