package test;

import java.util.Arrays;

/**
 * Created by Satya on 6/28/19.
 */
public class TripletOfSquares {

    public static void main(String args[]) {
        int nums[] = {3, 2, 4, 6, 5};
        System.out.println("is Triplet of squares exist ?"+isTripletExist(nums));
    }

    public static boolean isTripletExist(int[] nums) {
        if(nums == null || nums.length == 0)
            return false;

        Arrays.sort(nums);

        for(int i =0; i< nums.length-1;i++) {
            int target = nums[i] * nums[i];
            if(twoSum(nums, target, 0 , nums.length-1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean twoSum(int[] nums, int target, int left, int right) {
        while(left < right) {
           if(Math.pow(nums[left],2) + Math.pow(nums[right], 2) == target) {
               return true;
           }
           else if( Math.pow(nums[left],2) + Math.pow(nums[right], 2) < target){
               left++;
            } else {
               right --;
            }
        }
        return false;
    }
}
