package problem.challenge.april2021;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FurthestBuildingYouCanReach {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        if (ladders == 0) {
            return goNext(heights, bricks);
        }
        PriorityQueue<Integer> ladder = new PriorityQueue<>(ladders);
        int used_bricks = 0;
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] > heights[i + 1]) {
                continue;
            }
            int diff = heights[i + 1] - heights[i];
            if (ladder.size() < ladders) {
                ladder.add(diff);
                continue;
            }

            if (ladders > 0) {
                int minLadder = ladder.peek();
                if (minLadder < diff && minLadder + used_bricks <= bricks) {
                    used_bricks += ladder.poll();
                    ladder.add(diff);
                    continue;
                }
                if (used_bricks + diff <= bricks) {
                    used_bricks += diff;
                } else {
                    return i;
                }
            } else {
                if (used_bricks + diff <= bricks) {
                    used_bricks += diff;
                } else {
                    return i;
                }
            }
        }
        return heights.length - 1;
    }

    private int goNext(int[] heights, int bricks) {
        if (heights.length == 1) {
            return 0;
        }
        int[] heights2 = Arrays.stream(heights)
                .skip(1)
                .toArray();

        if (heights[0] >= heights[1]) {
            return 1 + goNext(heights2, bricks);
        } else if (heights[1] - heights[0] <= bricks) {
            return 1 + goNext((heights2), bricks - (heights[1] - heights[0]));
        } else {
            return 0;
        }
    }
}
