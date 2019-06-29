package test;

import java.util.Stack;

/**
 * Created by Satya on 6/28/19.
 */
public class MinStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int value) {
        stack1.push(value);
        if(stack2.isEmpty()) {
            stack2.push(value);
        } else {
            stack2.push(Math.min(stack2.peek(),value));
        }
    }

    public void pop(){
        stack1.pop();
        stack2.pop();
    }

    public int top(){
        return stack1.peek();
    }

    public int getMin() {
        return stack2.peek();
    }

}
