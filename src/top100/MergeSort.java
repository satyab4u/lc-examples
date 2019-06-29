package top100;

/**
 * Created by Satya on 6/25/19.
 */
public class MergeSort {
    public static void main(String args[]) {
        int[] nums = {6, 4, 8, 9, 10};
        // call mergeSort method

        mergeSort(nums, new int[nums.length], 0, nums.length - 1);

        for (int val : nums) {
            System.out.print(" " + val);
        }

    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {

        if (leftStart >= rightEnd) {
            return;
        }

        int middle = leftStart + (rightEnd - leftStart) / 2;
        // int middle = leftStart + rightEnd / 2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);


    }

    public static void mergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) {
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
