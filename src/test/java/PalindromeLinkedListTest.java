import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeLinkedListTest {
    @Test
    @DisplayName("input is \"book\", output should be true")
    public void determine() {
        PalindromeLinkedList.ListNode head = new PalindromeLinkedList.ListNode(1);
        head.next = new PalindromeLinkedList.ListNode(6);
        head.next.next = new PalindromeLinkedList.ListNode(6);
        head.next.next.next = new PalindromeLinkedList.ListNode(1);
        boolean result = PalindromeLinkedList.isPalindrome(head);
        assertEquals(true, result);
    }

    @DisplayName("with parameters")
    @ParameterizedTest(name = "input is {0}, output should be {1}")
    @CsvSource({
            "book, true",
            "MerryChristmas, false",
            "AbCdEfGh, true",
    })
    public void determine2(String input, boolean output) {
        boolean result = DetermineIfStringHalvesAreAlike.halvesAreAlike(input);
        assertEquals(output, result);
    }
}