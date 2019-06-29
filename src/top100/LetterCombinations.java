package top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Satya on 3/23/19.
 */
public class LetterCombinations {

    public static void main(String args[]) {

        String input = "23";
        List<String> words = comboWords(input);

        for (String word:words) {
            System.out.print(word+" ");
        }


    }

    public static List<String> comboWords(String digits) {

        Map<Character,String> phoneMap = new HashMap<>();
        phoneMap.put('2',"abc");
        phoneMap.put('3',"def");
        phoneMap.put('4',"ghi");
        phoneMap.put('5',"jkl");
        phoneMap.put('6',"mno");
        phoneMap.put('7',"pqrs");
        phoneMap.put('8',"tuv");
        phoneMap.put('9',"wxyz");

        List<String> words = new ArrayList<>();

        if(digits.length() == 2) {
            String word1 = phoneMap.get(digits.charAt(0));
            String word2 = phoneMap.get(digits.charAt(1));
            for(int i =0 ;i<word1.length();i++) {
                for(int j=0;j<word2.length();j++) {
                    words.add(String.valueOf(word1.charAt(i))+String.valueOf(word2.charAt(j)));
                }
            }
        }
        return words;
    }
}
