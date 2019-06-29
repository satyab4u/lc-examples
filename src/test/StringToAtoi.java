package test;

/**
 * Created by Satya on 6/27/19.
 */
public class StringToAtoi {

    public static void main(String args[]) {
        String s = "   -42";
        System.out.println("string value of integer"+stringToAtoi(s));
    }

    public static int stringToAtoi(String s) {
        if(s == null) return 0;

        s = s.trim();
        boolean isNegative = false;
        int startIndex = 0;
        if(s.charAt(startIndex) == '+' || s.charAt(startIndex) == '-')  startIndex++;
        double result = 0;
        if(s.charAt(0) == '-')
            isNegative = true;

        for(int i = startIndex ; i < s.length(); i++) {
            if(s.charAt(i) <= '0' || s.charAt(i) >= '9') {
                break;
            }
            int digitValue = (int)s.charAt(i) - '0';
            result  = result* 10 + digitValue;
        }

        if(isNegative)
            result = -result;
        if(result > Integer.MAX_VALUE)
            result = Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        }
        return (int)result;
    }
}
