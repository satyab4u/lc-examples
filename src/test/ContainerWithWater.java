package test;

/**
 * Created by Satya on 6/27/19.
 */
public class ContainerWithWater {

    public static void main(String args[]) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        System.out.println("maxArea:"+maxArea(heights));
    }

    public static int maxArea(int[] heights) {
        if(heights == null || heights.length == 0) return 0;

        int maxArea = 0;
        int left = 0;
        int right = heights.length-1;

        while(left <= right) {
            int area = Math.min(heights[left], heights[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if(heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
