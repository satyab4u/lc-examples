package top100;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Satya on 3/22/19.
 */
public class LongestSubstring {

    public static void main(String args[]) {
        String word = "pwwkew";
        System.out.println("length of longest substring:"+lengthOfLongestSubstring(word));
    }

    //2 pointer approach
    public static int lengthOfLongestSubstring(String word) {
        int maxLength = 0;
        int i =0,j= 0;
        Set<Character> characterSet = new HashSet<>();
        while(j < word.length()) {
            if(!characterSet.contains(word.charAt(j))) {
              characterSet.add(word.charAt(j));
              j++;
              maxLength = Math.max(maxLength,j-i);
            } else {
                characterSet.remove(word.charAt(i));
                i++;
            }
        }
        return maxLength;
    }
}


