package test;

/**
 * Created by Satya on 6/28/19.
 */
public class MinStackTest {
    public static  void main(String args[]) {
        MaxStack maxStack = new MaxStack();
        maxStack.push(10);
        maxStack.push(5);
        maxStack.push(1);
        System.out.println("min stack min element:"+maxStack.getMax());
    }

}
