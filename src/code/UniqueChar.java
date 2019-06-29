package code;

/**
 * Created by Satya on 6/24/19.
 */
public class UniqueChar {
    public static void main(String args[]) {
        String name = "loveleetcode";
        System.out.println(firstUniqChar(name));
    }

    public static int firstUniqChar(String s) {
        if(s == null || s.length() == 0) return -1;
        int[] charCounts = new int[26];

        for(char ch:s.toCharArray()) {
            charCounts[ch - 'a']++;
        }

        for(int i =0;i<s.length();i++) {
            if(charCounts[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}
