package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VerifyingAnAlienDictionaryTest {
    VerifyingAnAlienDictionary problem;

    @BeforeEach
    public void before() {
        problem = new VerifyingAnAlienDictionary();
    }


    @Test
    public void verify() {
        boolean result = problem.isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        assertTrue(result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest
    @MethodSource("getParamters")
    public void verify2(String[] input, String alienStr, boolean output) {
        boolean result = problem.isAlienSorted(input, alienStr);
        assertEquals(output, result);
    }

    private static Stream<Arguments> getParamters() {
        return Stream.of(
                Arguments.of((Object) new String[]{"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz", false),
                Arguments.of((Object) new String[]{"apple", "app"}, "abcdefghijklmnopqrstuvwxyz", false)
        );
    }
}
