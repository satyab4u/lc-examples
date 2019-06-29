package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Satya on 6/24/19.
 */
public class Wordbreak {

    public static void main(String args[]) {
      String word = "leetcode";
      List<String> wordDict = Arrays.asList("leet","code");
        System.out.println("word dict contains ?"+isWordBreak(word, wordDict));
    }

    public static boolean isWordBreak(String s, List<String> wordDict) {

        boolean[] isWordBreak = new boolean[s.length()+1];
        isWordBreak[0] = true;
        for(int i=0; i<= s.length();i++) {
            for(int j=0; j<i; j++) {
                if(!isWordBreak[j]) {
                    continue;
                }
                if(wordDict.contains(s.substring(j, i))) {
                    isWordBreak[i] = true;
                    break;
                }
            }
        }
        return isWordBreak[s.length()];
    }

}
