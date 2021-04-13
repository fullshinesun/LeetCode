package problem.challenge.april2021;

import datastructure.TreeNode;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        return traverse(0, root)[1];
    }

    private int[] traverse(int level, TreeNode head) {
        int[] leftResult = new int[]{0, 0};
        int[] rightResult = new int[]{0, 0};
        if (head.getLeft() == null && head.getRight() == null) {
            return new int[]{level, head.getVal()};

        }
        if (head.getLeft() != null) {
            leftResult = traverse(level + 1, head.getLeft());
        }
        if (head.getRight() != null) {
            rightResult = traverse(level + 1, head.getRight());
        }

        if (leftResult[0] != 0 && rightResult[0] != 0) {
            if (leftResult[0] > rightResult[0]) {
                return new int[]{leftResult[0], leftResult[1]};
            } else if (leftResult[0] < rightResult[0]) {
                return new int[]{rightResult[0], rightResult[1]};
            } else {
                return new int[]{leftResult[0], leftResult[1] + rightResult[1]};
            }
        } else if (leftResult[0] != 0) {
            return new int[]{leftResult[0], leftResult[1]};
        } else {
            return new int[]{rightResult[0], rightResult[1]};
        }
    }
}