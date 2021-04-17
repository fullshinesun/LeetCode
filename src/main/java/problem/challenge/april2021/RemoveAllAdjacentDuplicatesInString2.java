package problem.challenge.april2021;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString2 {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.push(new Pair(c, 1));
                continue;
            }
            Pair top = stack.peek();
            if (top.alphabet != c) {
                stack.push(new Pair(c, 1));
                continue;
            }

            if (top.length + 1 == k) {
                stack.pop();
            } else {
                stack.peek().increase();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            Pair top = stack.pop();
            for (int i = 0; i < top.length; i++) {
                sb.append(top.alphabet);
            }
        }
        return sb.reverse().toString();
    }

    static class Pair {
        char alphabet;
        int length;

        public Pair(char c, int length) {
            this.alphabet = c;
            this.length = length;
        }

        public void increase() {
            length = length + 1;
        }
    }
}
