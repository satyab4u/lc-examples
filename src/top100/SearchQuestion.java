package top100;

/**
 * Created by Satya on 3/30/19.
 */
public class SearchQuestion {
    public static void main(String args[]) {
        int[] array = {4,5,6,7,0,1,2};
        int target  = 4;
        System.out.println("index of the element:"+search(array,target));
    }

    public static int search(int[] nums,int target) {

        int left = 0;
        int right = nums.length-1;

        while(left <= right) {
            int mid = (left + right)/2;

            if(nums[mid] == target) return mid;

            if(nums[left] <= nums[mid]) {
                if(nums[left] <= target && target < nums[mid]) {
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid+1;
                } else {
                    right = mid-1;
                }
            }
        }
        return -1;
    }


}
