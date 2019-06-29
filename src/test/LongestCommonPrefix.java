package test;

/**
 * Created by Satya on 6/27/19.
 */
public class LongestCommonPrefix {

    public static void main(String args[]) {
        String[] strs = {"dog","racecar","car"};
        System.out.println("longest common prefix:"+longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
            return "";

        String commonPrefixStr = strs[0];

        for(int i = 1; i<strs.length; i++) {
            int j = 0;
            while(j < commonPrefixStr.length() && j < strs[i].length() && commonPrefixStr.charAt(j) == strs[i].charAt(j)){
                j++;
            }

            if(j == 0){
                return "";
            }
            commonPrefixStr = strs[i].substring(0,j);
        }
        return commonPrefixStr;
    }
}
