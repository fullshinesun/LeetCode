package problem.challenge.april2021;

import util.MyStringUtil;
import util.Stack;

public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            String subString = MyStringUtil.subString(s, i);
            max = Math.max(max, getValidLength(subString));
        }
        return max;
    }

    private int getValidLength(String s) {
        Stack stack = new Stack(s.length());
        int candidate = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                continue;
            } else if (stack.isEmpty() || stack.peek() != '(') {
                break;
            }
            stack.pop();
            length += 2;
            if (stack.isEmpty()) {
                candidate = length;
            }
        }
        return candidate;
    }
}
