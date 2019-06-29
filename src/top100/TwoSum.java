package top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Satya on 3/19/19.
 */
public class TwoSum {

    public static void main(String args[]) {

        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] result = twoSum(nums,target);

        System.out.println("index 1 :"+result[0] +" index2:"+result[1]);
    }

    public static int[] twoSum(int[] nums,int target) {
      /*for(int i =0;i<nums.length;i++) {
          int result = target - nums[i];
          for(int j=i+1;j<nums.length;j++) {
              if(nums[j] == result) {
                  return new int[]{i,j};
              }
          }
      }
      return new int[]{0,0};*/

      Map<Integer,Integer> visited = new HashMap<>();
      int[] result = new int[2];

      for(int i=0;i<nums.length;i++) {
          if(visited.containsKey(target-nums[i])) {
              result[0] = i;
              result[1] = visited.get(target-nums[i]);
              return result;
          } else  {
              visited.put(nums[i],i);
          }
      }
      return result;
    }
}
