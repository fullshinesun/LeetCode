package problem.challenge.april2021;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = null;
        ListNode lessTail = null;
        ListNode moreHead = null;
        ListNode moreTail = null;
        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                if (lessHead == null) {
                    lessHead = new ListNode(curr.val);
                    lessTail = lessHead;
                } else {
                    lessTail.next = new ListNode(curr.val);
                    lessTail = lessTail.next;
                }
            } else {
                if (moreHead == null) {
                    moreHead = new ListNode(curr.val);
                    moreTail = moreHead;
                } else {
                    moreTail.next = new ListNode(curr.val);
                    moreTail = moreTail.next;
                }
            }
            curr = curr.next;
        }
        if (lessHead != null) {
            lessTail.next = moreHead;
            return lessHead;
        }
        return moreHead;
    }

    public class ListNode {
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
