package code;

/**
 * Created by Satya on 5/4/19.
 */
public class CompressString {

    public static void main(String args[]) {
        String str = "aabbccccaaa";
        System.out.println("compress string:"+compressString(str));
    }

    public static String compressString1(String str) {
        StringBuilder sb= new StringBuilder();
        int consecutiveCount = 0;
        for(int i=0;i<str.length();i++) {
            consecutiveCount++;

            if((i+1) > str.length() || str.charAt(i) != str.charAt(i+1)) {
                sb.append(str.charAt(i));
                sb.append(consecutiveCount);
                consecutiveCount = 0;
            }
        }
        return sb.toString();
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length();) {
            int count = 1;
            int j = i+1;
            while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                j++;
                count++;
            }
            sb.append(str.charAt(i));
            sb.append(count);
            i = i+count;
        }
        return sb.toString();
    }
}
