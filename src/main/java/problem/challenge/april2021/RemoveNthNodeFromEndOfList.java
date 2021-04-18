package problem.challenge.april2021;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pin = head;
        ListNode curr = head;
        // 리스트 1개일 때
        if (head.next == null && n == 1) {
            return null;
        }

        if (n == 1) {
            while (curr.next.next != null) {
                curr = curr.next;
            }
            curr.next = null;
            return head;
        }

        for (int i = 0; i <= n; i++) {
            if (curr == null) {
                return head.next;
            }
            curr = curr.next;
        }
        while (curr != null) {
            pin = pin.next;
            curr = curr.next;
        }
        pin.next = pin.next.next;
        return head;
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

}
