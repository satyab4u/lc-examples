package code;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Satya on 6/24/19.
 */
public class TwoSum {

    public static void main(String args[]) {
        int[] nums = new int[]{2,7,11,15};
        int[] result = twoSum(nums, 9);
        System.out.println(result[0] +" " + result[1]);

    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++) {
            if(hm.containsKey(target - nums[i])) {
                result[0] = hm.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            hm.put(nums[i], i);
        }
        return result;
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.containsKey(target - nums[i])) {
                result[0] = visited.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            visited.put(nums[i], i);
        }
        return result;
    }
}
