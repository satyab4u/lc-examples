package top100;

/**
 * Created by Satya on 3/22/19.
 */
public class MedianOfSortedArrays {

    public static void main(String args[]) {

        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int n = nums1.length;
        int m = nums2.length;
        System.out.printf("median value:" + medianOfArrays(nums1, nums2, n, m));
    }

    public static double medianOfArrays(int[] nums1, int[] nums2, int n, int m) {

        int i = 0, j = 0;
        int count = 0;
        int m1 = -1, m2 = -1;

        for (count = 0; count < ((n + m) / 2)+1; count++) {
            m2 = m1;
            if (i != n && j != m) {
                m1 = (nums1[i] > nums2[j]) ? nums2[j++] : nums1[i++];
            } else if (i < n) {
                m1 = nums1[i++];
            } else {
                m1 = nums2[j++];
            }
        }
        System.out.println("m1 value:"+m1 +"m2 value:"+m2);
        if((n+m)%2 == 1)
            return m1;
        else
            return (double)(m1+m2)/2;
    }
}



