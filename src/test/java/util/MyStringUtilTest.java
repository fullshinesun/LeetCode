package util;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MyStringUtilTest {

    @ParameterizedTest
    @CsvSource({
            "\"abcde\", 0",
            "\"abcde\", 3",
            "\"abcde\", 4",

    })
    public void equalsTest(String str, int startAt) {
        assertEquals(str.substring(startAt), MyStringUtil.subString(str, startAt));
    }
}