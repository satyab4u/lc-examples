package test;

/**
 * Created by Satya on 6/28/19.
 */
public class LeftRotate {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        printArray(arr);
        leftRotate(arr, 7, arr.length);
        printArray(arr);
    }

    public static void leftRotate(int[] arr, int d, int n) {
        for(int i= 0; i<d; i++) {
            leftRotateByOne(arr, n);
        }
    }

    public static void leftRotateByOne(int[] arr, int n) {
        int temp = arr[0];
        for(int i=0; i<n-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }

    public static void printArray(int[] arr) {
        for(int value: arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
