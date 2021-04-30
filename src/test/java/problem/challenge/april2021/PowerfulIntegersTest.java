package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PowerfulIntegersTest {
    PowerfulIntegers problem;

    @BeforeEach
    public void before() {
        problem = new PowerfulIntegers();
    }

    @Test
    public void test1() {
        List<Integer> result = problem.powerfulIntegers(2, 3, 10);
        assertEquals(Arrays.asList(2, 3, 4, 5, 7, 9, 10), result);
    }

    @Test
    public void test2() {
        List<Integer> result = problem.powerfulIntegers(3, 5, 15);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10, 14), result);
    }

    @Test
    public void test3() {
        List<Integer> result = problem.powerfulIntegers(2, 1, 10);
        assertEquals(Arrays.asList(2, 3, 5, 9), result);
    }

}
