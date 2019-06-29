package code;

/**
 * Created by Satya on 6/24/19.
 */
public class LargestRectange {
    public static void main(String args[]) {
        int[] heigts =new int[]{2, 1, 5, 6, 2, 3};
        System.out.println("max rectange area:"+maxRectangeArea(heigts));
    }

    public static int maxRectangeArea(int[] heights) {
        int area = 0;

        for(int i=1 ;i<heights.length;i++) {
            int len = Math.min(i, i-1);
            int width = 2;
            area = Math.max(area, (len * width));
        }
        return area;
    }
}
