package problem.challenge.april2021;

import java.util.LinkedList;
import java.util.List;

public class NaryTreePreorderTraversalSolution {
    public List<Integer> preorder(Node root) {
        return traverse(root);
    }

    private List<Integer> traverse(Node head) {
        List<Integer> preOrderResult = new LinkedList<>();
        if (head == null) {
            return preOrderResult;
        }

        preOrderResult.add(head.val);
        if (head.children == null) {
            return preOrderResult;
        }
        for (Node node : head.children) {
            preOrderResult.addAll(traverse(node));
        }
        return preOrderResult;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
