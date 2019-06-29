package test;

import java.util.Stack;

/**
 * Created by Satya on 6/26/19.
 */
public class LargestRectange {

    public static void main(String args[]) {
        int[] heights ={2,1,5,6,2,3};
        System.out.println("Max area:"+largestRectangleArea(heights));

    }

    public static int largestRectangleArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for(int i=0; i< heights.length; i++) {
            int currBarHeight = heights[i];
            while(stack.peek() != -1 && currBarHeight <= heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = i - stack.peek() -1 ;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        while(stack.peek() != -1) {
            int height = heights[stack.pop()];
            int width = heights.length - stack.peek() -1;
            maxArea = Math.max(maxArea, height * width);
        }
        return maxArea;
    }
}
