package test;

import java.util.Stack;

/**
 * Created by Satya on 6/28/19.
 */
public class MaxStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MaxStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int value) {
        stack1.push(value);
        if(stack2.isEmpty()) {
            stack2.push(value);
        } else {
            stack2.push(Math.max(stack2.peek(),value));
        }
    }

    public Integer pop() {
        stack2.pop();
        return stack1.pop();
    }

    public Integer getMax() {
        return stack2.peek();
    }
}
