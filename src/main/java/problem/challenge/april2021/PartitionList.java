package problem.challenge.april2021;

import java.util.HashMap;
import java.util.Map;

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

    public ListNode partition2(ListNode head, int x) {
        Map<Boolean, ListNode[]> pointer = new HashMap<>();
        pointer.put(Boolean.TRUE, new ListNode[]{null, null});
        pointer.put(Boolean.FALSE, new ListNode[]{null, null});
        ListNode curr = head;
        while (curr != null) {
            ListNode[] p = pointer.get(curr.val < x);
            if (p[0] == null) {
                p[0] = new ListNode(curr.val);
                p[1] = p[0];
            } else {
                p[1].next = new ListNode(curr.val);
                p[1] = p[1].next;
            }
            curr = curr.next;
        }
        if (pointer.get(true)[0] != null) {
            pointer.get(true)[1].next = pointer.get(false)[0];
            return pointer.get(true)[0];
        }
        return pointer.get(false)[0];
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
