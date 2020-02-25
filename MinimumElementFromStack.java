package algorithm.fun;

import java.util.Scanner;
import java.util.Stack;

public class MinimumElementFromStack {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MinimumElementFromStack minElementFromStack = new MinimumElementFromStack();
        boolean validData = true;
        int query;
        while (validData) {
            System.out.println("Enter query as 1-a query of this type means  pushing 'x' into the stack,"
                + " 2-a query of this type means to pop element from stack and print the poped element ,"
                + "3-a query of this type means to print the minimum element from the stack ?");
            query = sc.nextInt();

            if (query == 1) {
                System.out.println("Enter element to push on stack:");
                int item = sc.nextInt();
                System.out.println("Pushing item " + item + " on stack..");
                minElementFromStack.push(item);
            }

            if (query == 2) {
                minElementFromStack.pop();
            }

            if (query == 3) {
                minElementFromStack.getMin();
            }

            if (query == 0) {
                validData = false;
            }
        }

    }

    int minEle;
    Stack<Integer> s = new Stack<Integer>();

    /* returns min element from stack */
    int getMin() {
        int minTemp = 0;
        if (!s.isEmpty()) {
            minTemp = s.firstElement();
        } else {
            return minTemp;
        }

        while (s.isEmpty()) {
            if (minTemp > s.peek()) {
                minTemp = s.peek();
            }
        }
        System.out.println("Displaying elements from stack " + s + " Returning min element as " + minTemp);

        return minTemp;
    }

    /* returns poped element from stack */
    int pop() throws Exception {
        if (!s.isEmpty()) {
            s.pop();
            System.out.println("Displaying elements from stack " + s);
        } else {
            throw new Exception("Stack is empty!! Nothing to pop dude..");
        }
        return 0;
    }

    /* push element x into the stack */
    void push(int x) {
        s.push(x);
        System.out.println("Displaying elements from stack " + s);
    }

}
