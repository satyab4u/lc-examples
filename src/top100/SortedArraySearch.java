package top100;

/**
 * Created by Satya on 3/30/19.
 */
public class SortedArraySearch {
    public static void main(String args[]) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int[] result = new int[] {first(nums,target),last(nums,target)};
   //     int[] result = searchRange(nums,target);
        System.out.println("values: "+result[0]+" - "+result[1]);

     }

     public static int first(int[] nums,int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            if((mid == 0 || target > nums[mid-1]) &&  nums[mid] == target )  {
                return mid;
            } else if(target <= nums[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
     }

    public static int last(int[] nums,int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right) {
            int mid = left + (right-left)/2;
            if((mid == nums.length-1 || target < nums[mid+1]) &&  nums[mid] == target )  {
                return mid;
            } else if(target <= nums[mid]) {
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }

     public static int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
         int index = -1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                index = mid;
                break;
            }
            if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid+1;
            }
        }
        if(index == -1) {
            return new int[]{index,index};
        } else {
            int i= index,j = index;
            while(i >= 0 && (nums[--i] == target)) {
              // i--;
            }
            while(j <= nums.length-1 && nums[++j] == target) {
               // j++;
            }
            return new int[]{i+1,j-1};
        }
     }
}
