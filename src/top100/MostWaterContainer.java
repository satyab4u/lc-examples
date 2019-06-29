package top100;

/**
 * Created by Satya on 3/23/19.
 */
public class MostWaterContainer {
    public static void main(String args[]) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("max area:"+maxArea(height));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        if(height == null) {
            return 0;
        }

        int left = 0;
        int right = height.length-1;

        while(left < right) {
            int area  = (right-left) * Math.min(height[left],height[right]);
            if(area > maxArea) {
                maxArea = area;
            }
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
