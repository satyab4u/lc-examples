package top100;

import java.util.Stack;

/**
 * Created by Satya on 3/28/19.
 */
public class LongestValidParenthesis {

    public static void main(String args[]) {
        String  str = ")()())";
        System.out.println("longest valid parenthesis:"+longestValidParenthesis(str));
    }

    public static int longestValidParenthesis(String str) {
        int left = 0;

        int right = str.length()-1;

        int max = 0;

        while(left < right) {
            while((left < right) && str.charAt(left) != '('){
                left++;
            }
            int count = 1;
            for(int i=left+1;i<=right;i++) {
               if(str.charAt(i) == ')' ){
                   count--;
               } else {
                   count++;
               }
               if(count == 0 && (i-left) > max) {
                   max = i-left+1;
               }
            }
            left++;
        }
    return max;
    }


}
