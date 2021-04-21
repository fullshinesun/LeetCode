package problem.challenge.april2021;

import java.util.Arrays;

public class CombinationSum4 {

    public int combinationSum4(int[] nums, int target) {
        int[] result = new int[target + 1];
        int[] numsInOrder = Arrays.stream(nums).sorted().toArray();

        for (int i = 1; i <= target; i++) {
            int cnt = 0;
            for (int num : numsInOrder) {
                if (i - num < 0) {
                    break;
                } else if (num == i) {
                    cnt += 1;
                } else {
                    cnt += result[i - num];
                }
            }
            result[i] = cnt;
        }
        return result[target];
    }

}
