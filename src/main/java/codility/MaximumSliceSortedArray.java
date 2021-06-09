package codility;

import java.util.Arrays;

public class MaximumSliceSortedArray {
    public int solution(int[] A) {
        int slices = 0;
        int[] sorted = Arrays.stream(A).sorted().toArray();

        int max = 0;
        for (int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
            if (max == sorted[i]) {
                slices++;
            }
        }
        return slices;
    }
}
