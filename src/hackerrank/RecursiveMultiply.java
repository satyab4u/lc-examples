package hackerrank;

/**
 * Created by Satya on 4/6/19.
 */
public class RecursiveMultiply {

    public static void main(String args[]) {
        int a = 8;
        int b = 7;
        System.out.println("min product :"+minProduct(8,7));
    }

    public static int minProduct(int a, int b) {
        int smaller = a < b ? a:b;
        int bigger = a > b ? a:b;
        int memo[] = new int[smaller+1];
        return minProductHelper(smaller,bigger,memo);
    }

    public static int minProductHelper(int smaller,int bigger,int[] memo) {
        if(smaller == 0) return 0;
        else if(smaller == 1) return bigger;
        else if(memo[smaller] > 0) return memo[smaller];

            int s = smaller >> 1; //divide by 2
            int side1 = minProduct(s,bigger);
            int side2 = side1;
            if(smaller % 2 == 1){
              //  side2 = minProductHelper(smaller-s, bigger,memo);
                side2 = side1+bigger;
            }
            memo[smaller] = side1+side2;

        return memo[smaller];
    }
}
