package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePaths2Test {
    UniquePaths2 problem;

    @BeforeEach
    public void before() {
        problem = new UniquePaths2();
    }

    @Test
    public void minOpTest() {
        int[][] input = new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int result = problem.uniquePathsWithObstacles(input);
        assertEquals(2, result);
    }

    @Test
    public void minOpTest2() {
        int[][] input = new int[][]{{1}};
        int result = problem.uniquePathsWithObstacles(input);
        assertEquals(0, result);
    }
}
