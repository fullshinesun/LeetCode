package problem.challenge.april2021;

import datastructure.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeepestLeavesSumTest {
    DeepestLeavesSum problem;

    @BeforeEach
    public void before() {
        problem = new DeepestLeavesSum();
    }

    @Test
    @DisplayName("input is 3, output should be 2")
    public void minOpTest() {
        TreeNode root = getTree();
        int result = problem.deepestLeavesSum(root);
        assertEquals(15, result);
    }

    // root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
    private TreeNode getTree() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(4));
        root.getLeft().setRight(new TreeNode(5));
        root.getRight().setRight(new TreeNode(6));
        root.getLeft().getLeft().setLeft(new TreeNode(7));
        root.getRight().getRight().setRight(new TreeNode(8));
        return root;
    }
}