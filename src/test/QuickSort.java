package test;

/**
 * Created by Satya on 6/25/19.
 */
public class QuickSort {
    public static void main(String args[]) {
        int[] array=new int[]{9,2,6,4,3,5,1};
        quicksort(array,0,array.length-1);
        for(int val: array){
            System.out.print(val+" ");
        }
    }

    public static void quicksort(int[] array, int left, int right) {
        if(left >= right) return;
        int pivot = array[(left + right)/2];
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index-1);
        quicksort(array, index, right);
    }

    public static int partition(int[] array, int left, int right, int pivot) {

        while(left <= right) {
            while(array[left] < pivot) {
                left++;
            }
            while(array[right] > pivot) {
                right--;
            }
            if(left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    public static int partition1(int[] array, int left, int right, int pivot) {
        while (left <= right){
            while(array[left] > pivot){
                left++;
            }
            while(array[right] > pivot){
                right --;
            }

            if(left <= right){
                swap(array,left,right);
            }

        }
        return left;
    }

    public static void swap(int[] array,int left,int right){
        int temp= array[left];
        array[left] = array[right];
        array[right]= temp;
    }
}
