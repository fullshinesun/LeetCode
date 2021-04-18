package problem.challenge.april2021;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RemoveNthNodeFromEndOfListTest {
    RemoveNthNodeFromEndOfList problem;

    @BeforeEach
    public void before() {
        problem = new RemoveNthNodeFromEndOfList();
    }

    @Test
    public void minOpTest() {
        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        RemoveNthNodeFromEndOfList.ListNode result = problem.removeNthFromEnd(head, 1);
        assertEquals(null, result);
    }

    @Test
    public void minOpTest2() {
        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        RemoveNthNodeFromEndOfList.ListNode result = problem.removeNthFromEnd(head, 1);
        assertEquals(1, result.val);
        assertNull(result.next);
    }

    @Test
    public void minOpTest3() {
        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        RemoveNthNodeFromEndOfList.ListNode result = problem.removeNthFromEnd(head, 2);
        assertEquals(2, result.val);
        assertNull(result.next);
    }

    @Test
    public void minOpTest4() {
        RemoveNthNodeFromEndOfList.ListNode head = new RemoveNthNodeFromEndOfList.ListNode(1);
        head.next = new RemoveNthNodeFromEndOfList.ListNode(2);
        head.next.next = new RemoveNthNodeFromEndOfList.ListNode(3);
        head.next.next.next = new RemoveNthNodeFromEndOfList.ListNode(4);
        head.next.next.next.next = new RemoveNthNodeFromEndOfList.ListNode(5);
        RemoveNthNodeFromEndOfList.ListNode result = problem.removeNthFromEnd(head, 2);
        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(5, result.next.next.next.val);
        assertNull(result.next.next.next.next);
    }
}
