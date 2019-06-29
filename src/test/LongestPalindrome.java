package test;

/**
 * Created by Satya on 6/27/19.
 */
public class LongestPalindrome {

    public static void main(String args[]) {
        String str = "babad";
        System.out.println("longest palindrome string:"+longestPalindrome(str));
    }

    public static String longestPalindrome(String str) {
        if(str  == null || str.length() < 2) {
            return str;
        }

        boolean[][] isPalindrome = new boolean[str.length()][str.length()];
        int left = 0;
        int right = 0;

        for (int j =1; j< str.length();j++) {
            for(int i = 0; i<j; i++) {
                boolean innerWordPalindrome = isPalindrome[i+1][j-1] || (j-i) <= 2;

                if(innerWordPalindrome && str.charAt(i) == str.charAt(j)) {
                    isPalindrome[i][j] = true;

                    if(j-i > right - left) {
                        left = i;
                        right = j;
                    }
                }
            }
        }
        return str.substring(left, right+1);
    }


    public static String longestPalindrome1(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int length = s.length();

        boolean[][] isPalindrome = new boolean[length][length];

        int left = 0;
        int right = 0;

        for (int j = 1; j < length; j++) {
            for (int i = 0; i < j; i++) {
                boolean isInnerWordPalindrome = isPalindrome[i + 1][j - 1] || j - i <= 2;

                if (s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
                    isPalindrome[i][j] = true;

                    if (j - i > right - left) {
                        left = i;
                        right = j;
                    }
                }
            }
        }

        return s.substring(left, right + 1);
    }

}
