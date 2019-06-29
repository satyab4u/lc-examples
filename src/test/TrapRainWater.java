package test;

/**
 * Created by Satya on 6/27/19.
 */
public class TrapRainWater {
    public static void main(String args[]) {
        int[] heights = {2,1,0,2,0,0,1,3};
        System.out.println("Amount of water:"+trap(heights));
    }

    public static int trap(int[] heights) {
        int totalAmount = 0;
        if(heights == null || heights.length == 0) {
            return totalAmount;
        }

        int[] leftHeighest = new int[heights.length+1];
        leftHeighest[0] = 0;
        for(int i = 0; i< heights.length; i++) {
            leftHeighest[i + 1] = Math.max(leftHeighest[i], heights[i]);
        }

        int rightHeighest = 0;
        for(int i = heights.length-1; i >= 0; i--) {
            rightHeighest = Math.max(rightHeighest, heights[i]);
            totalAmount += Math.min(leftHeighest[i],rightHeighest) > heights[i]?(Math.min(leftHeighest[i],rightHeighest) - heights[i]) : 0;
        }
        return totalAmount;
    }

}
