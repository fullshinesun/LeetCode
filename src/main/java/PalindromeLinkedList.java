public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {
        return true;
    }

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
