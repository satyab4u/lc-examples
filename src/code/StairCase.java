package code;

/**
 * Created by Satya on 6/24/19.
 */
public class StairCase {
    public static void main(String args[]) {
        System.out.println("count ways:"+countStairs(5));
    }

    public static int countWays(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        return countWays(n-1) + countWays(n-2);
    }

    public static int countWays2(int n) {
        int a1 = 1;
        int a2 = 2;
        for (int i = 3; i < n; i++) {
            int temp = a2;
            a2 = a2 + a1;
            a1 = temp;
        }
        return a1+a2;
    }
    public static int countStairs(int n) {
        if(n < 1) return 1;

        int[] ways = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i=2; i<=n;i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n];

    }
}
