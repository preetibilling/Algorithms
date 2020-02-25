package algorithm.fun;

import java.util.Stack;

public class LongestValidParantheses {

    public static void main(String[] args) {
        // int length = longestValidParentheses("()");
        // int length = longestValidParentheses(")()())");
        // int length = longestValidParentheses("())");
        // int length = longestValidParentheses("())");
        // int length = longestValidParentheses("()(()");
        int length = longestValidParentheses("(()()");
        System.out.println(length);
    }

    /*
     * public static int longestValidParentheses(String str) { Stack st = new Stack(); int length = 0; for (int i = 0; i
     * < str.length(); i++) { char ch = str.charAt(i); if (ch == '(' && st.empty()) { st.push(ch); } else if (ch == '('
     * && !st.empty() && st.peek().equals('(') && str.length() < 2) { return length; } else if (ch == '(' && !st.empty()
     * && st.peek().equals('(') && str.length() > 2) { st.push(ch); }
     * 
     * if (ch == ')' && !st.isEmpty() && st.peek().equals('(')) { st.pop(); length = length + 2; } else { continue; }
     * 
     * }
     * 
     * if (str.length() > 3 && !st.empty()) { length = length - 2;
     * 
     * Math.max(a, b) } return length; }
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (!stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.empty();
    }

    public static int longestValidParentheses(String s) {
        int maxlen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 2; j <= s.length(); j += 2) {
                if (isValid(s.substring(i, j))) {
                    maxlen = Math.max(maxlen, j - i);
                }
            }
        }
        return maxlen;
    }

}
