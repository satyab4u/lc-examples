package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Satya on 6/24/19.
 */
public class ThreeSum {

    public static void main(String args[]) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> results = threeSum(nums);
        for(List<Integer> triplet : results) {
            System.out.println(triplet.get(0) + " "+triplet.get(1) +" "+triplet.get(2));
        }
    }

    public static List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> results = new ArrayList<>();
       if(nums == null || nums.length < 3) {
           return results;
       }
        Arrays.sort(nums);
       for(int i =0;i<nums.length;i++) {
           if(i > 0 && nums[i] == nums[i-1]) {
               continue;
           }
           int left = i+1;
           int right = nums.length -1;
           int target = -nums[i];
           twoSum(results,nums,target,left,right);
       }
       return results;

    }

    public static void twoSum(List<List<Integer>> results, int[] nums, int target, int left, int right) {
        while(left < right) {
           if(nums[left] + nums[right] == target) {
               List<Integer> triplet = new ArrayList<>();
               triplet.add(nums[left]);
               triplet.add(nums[right]);
               triplet.add(-target);
               results.add(triplet);
               left++;
               right --;

               while(left < right && nums[left] == nums[left -1]) {
                  left++;
               }
               while(left < right && nums[right] == nums[right+1]) {
                   right--;
               }

           } else if(nums[left] + nums[right] > target) {
               right--;
           } else if(nums[left] + nums[right] < target) {
               left++;
           }
        }
    }
}
