package codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumSliceSortedArrayTest {
    MaximumSliceSortedArray problem;

    @BeforeEach
    public void before() {
        problem = new MaximumSliceSortedArray();
    }

    @Test
    public void determine() {
        assertEquals(3, problem.solution(new int[]{2, 4, 1, 6, 5, 9, 7}));
    }

    @Test
    public void determine2() {
        assertEquals(4, problem.solution(new int[]{1, 2, 3, 4}));
        assertEquals(1, problem.solution(new int[]{4, 3, 2, 1}));
    }

}
