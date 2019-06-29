package top100;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Satya on 3/24/19.
 */
public class Main_ThreeSum {

    public static void main(String args[]) {
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<nums.length-2;i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            twoSum(result,nums,i+1,nums.length-1,-nums[i]);
        }

       // for()

    }

    public static void twoSum(List<List<Integer>> result,int[] nums,int left, int right,int target) {
        while(left < right) {
            if((nums[left]+nums[right]) == target) {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(-target);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                result.add(triplet);
                left++;
                right--;
                while((left < right) && (nums[left] == nums[left+1])) {
                    left++;
                }
                while((left < right) && (nums[right] == nums[right-1])) {
                    right--;
                }
            } else if((nums[left]+nums[right]) < target) {
                left++;
            } else if((nums[left]+nums[right]) > target) {
                right--;
            }
        }
    }

}
