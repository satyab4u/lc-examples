package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Satya on 3/20/19.
 */
public class ThreeSum {

    public static void main(String args[]) {
        int nums[] = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-2; i++) {
            int target = -nums[i];
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            twoSum(result,nums,i+1,nums.length-1,target);
        }
        //printing
        for(List<Integer> triplet: result) {
            for(Integer value:triplet) {
                System.out.print(value +" ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> twoSum(List<List<Integer>> result,int[] nums,int left,int right, int target) {
        while(left < right) {
            if((nums[left]+nums[right]) == target) {
                List<Integer> triplet = new ArrayList<>();
                triplet.add(-target);
                triplet.add(nums[left]);
                triplet.add(nums[right]);
                result.add(triplet);
                left++;
                right--;
                while (left < right &&  nums[left] == nums[left+1]) {
                    left++;
                }
                while(left < right && nums[right] == nums[right-1]) {
                    right--;
                }

            } else if((nums[left]+nums[right]) < target) {
                left++;
            } else if((nums[left]+nums[right]) > target) {
                right--;
            }
         }
      return result;
    }
}
