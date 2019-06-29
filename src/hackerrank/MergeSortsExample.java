package hackerrank;

/**
 * Created by Satya on 6/25/19.
 */
public class MergeSortsExample {
    public static void main(String arg[]) {
        int[] nums = {6, 4, 8, 9, 10};
        mergeSort(nums);
        System.out.println("Printing the sorted list");
        for(int value: nums) {
            System.out.print(" "+value);
        }
        System.out.println();
    }

    public static void mergeSort(int[] nums) {
        mergeSort(nums, new int[nums.length],0, nums.length-1);
    }

    public static void mergeSort(int[] nums, int[] temp, int left, int right) {
        if(left >= right)  return;

        int mid = left + (right - left) / 2;
        mergeSort(nums, temp, left, mid);
        mergeSort(nums, temp, mid+1, right);
        mergeHalves(nums,temp,left,right);
    }

    public static void mergeHalves(int[] nums, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = leftStart + (rightEnd - leftStart)/2;
        int rightStart = leftEnd + 1;
        int index = leftStart;
        int size = rightEnd-leftStart + 1;
        int left = leftStart;
        int right = rightStart;

        while(left <= leftEnd && right <= rightEnd) {
            if(nums[left] <= nums[right]) {
                temp[index] = nums[left];
                left++;
            } else {
                temp[index] = nums[right];
                right++;
            }
            index++;
        }
        System.arraycopy(nums, left, temp, index, leftEnd-left+1);
        System.arraycopy(nums, right, temp, index, rightEnd-right+1);
        System.arraycopy(temp, leftStart, nums, leftStart, size);

    }

    public static void mergeHalves1(int[] array, int[] temp, int leftStart, int rightEnd) {
/*
        int leftEnd = leftStart + rightEnd / 2;*/
        int leftEnd = leftStart + (rightEnd - leftStart) / 2;

        int rightStart = leftEnd + 1;

        int size = rightEnd - leftStart + 1;

        int index = leftStart;

        int left = leftStart;
        int right = rightStart;


        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);


    }
}
