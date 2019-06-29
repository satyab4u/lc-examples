package top100;

/**
 * Created by Satya on 3/23/19.
 */
public class LongestPalindrome {

    public static void main(String args[]) {
        String str = "cbbd";
        System.out.println("Longest palindrome substring:"+longPalindrome(str));
    }

    //take a closer look at dynamic programming

    public static String longPalindrome(String s) {
        int length = s.length();
        if(s == null || s.length() < 2) {
            return s;
        }
        boolean isPalindrome[][] = new boolean[length][length];
        int left = 0;
        int right = 0;
        for(int j=1; j<length; j++) {
            for(int i=0 ; i<j; i++) {
                boolean isInnerWordPalindrome = (isPalindrome[i+1][j-1] || (j-i) <= 2 );
                if(s.charAt(i) == s.charAt(j) && isInnerWordPalindrome) {
                    isPalindrome[i][j] = true;

                    if(j-i > right-left) {
                        left = i;
                        right = j;
                    }
                }

            }
        }
        return s.substring(left, right+1);
    }

    public static String longestPalindrome(String str) {
        String palindrome = "";
        for(int i=0;i<str.length();i++) {
            int right = str.length()-1;
            while(right > i) {
                if(str.charAt(i) == str.charAt(right)) {
                    String subword = str.substring(i,right+1);
                    if(isPalindrome(subword) && subword.length() > palindrome.length()) {
                        palindrome = subword;
                    }
                    right--;
                } else {
                    right --;
                }
            }
        }
        return palindrome;
    }

    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length()-1;
        while(left < right) {
            if(word.charAt(left++) != word.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

}
