package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NaryTreePreorderTraversalSolutionTest {
    NaryTreePreorderTraversalSolution problem;

    @BeforeEach
    public void before() {
        problem = new NaryTreePreorderTraversalSolution();
    }

    @Test
    public void determine() {
        NaryTreePreorderTraversalSolution.Node root = new NaryTreePreorderTraversalSolution.Node(1);
        NaryTreePreorderTraversalSolution.Node node3 = new NaryTreePreorderTraversalSolution.Node(3);
        node3.children = Arrays.asList(new NaryTreePreorderTraversalSolution.Node(5), new NaryTreePreorderTraversalSolution.Node(6));
        root.children = Arrays.asList(node3, new NaryTreePreorderTraversalSolution.Node(2), new NaryTreePreorderTraversalSolution.Node(4));

        List<Integer> result = problem.preorder(root);
        assertEquals(Arrays.asList(1, 3, 5, 6, 2, 4), result);
    }

}
