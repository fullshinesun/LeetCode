package problem.challenge.may2021;

public class ConvertSortedListToBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }

        int length = 0;
        ListNode root = head;
        while (root != null) {
            length++;
            root = root.next;
        }

        int[] nums = new int[length];

        root = head;
        for (int i = 0; root != null; i++) {
            nums[i] = root.val;
            root = root.next;
        }

        return makeBST(nums, 0, length - 1);
    }

    private TreeNode makeBST(int[] nums, int startAt, int endAt) {
        if (startAt == endAt) {
            return new TreeNode(nums[startAt]);
        } else if (startAt > endAt) {
            return null;
        }
        int mid = startAt + (endAt - startAt) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = makeBST(nums, startAt, mid - 1);
        root.right = makeBST(nums, mid + 1, endAt);
        return root;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
