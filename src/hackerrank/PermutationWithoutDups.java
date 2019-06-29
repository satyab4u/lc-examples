package hackerrank;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Satya on 4/7/19.
 */
public class PermutationWithoutDups {
    public static void main(String args[]) {
        String str = "SAM";
        List<String> result = getPerms(str);
        System.out.println("result size:"+result.size());
        System.out.println("result:"+result);
    }

    public static List<String> getPerms(String remainder) {
        int len = remainder.length();
        List<String > result = new ArrayList<>();

        //base case
        if(len == 0){
            result.add("");
            return result;
        }

        for(int i=0; i<remainder.length();i++) {
            String before = remainder.substring(0,i);
            String after  = remainder.substring(i+1,len);
            List<String> partials = getPerms(before+after);
            /* pre append character i to each permutation */
            for(String s : partials) {
                result.add(remainder.charAt(i)+s);
            }
        }
        return result;
    }
}
