package algorithm.fun;

import java.util.Stack;

public class ParenthesisChecker {

    public static void main(String[] args) {
        checkValidParanthesis("(()");
    }

    private static void checkValidParanthesis(String string) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }

            if ((!stack.isEmpty() && ch == '}' && stack.peek() == '{')) {
                stack.pop();
            } else if ((!stack.isEmpty() && ch == ']' && stack.peek() == '[')) {
                stack.pop();
            } else if ((!stack.isEmpty() && ch == ')' && stack.peek() == '(')) {
                stack.pop();
            }
        }

        if (stack != null && stack.size() > 0) {
            System.out.println("not balanced");
        } else {
            System.out.println(" balanced");
        }
    }

}
