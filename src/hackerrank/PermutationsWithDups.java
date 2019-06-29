package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Satya on 4/7/19.
 */
public class PermutationsWithDups {

    public static void main(String args[]) {
        String str = "ABA";
        List<String> result = printPerms(str);
        System.out.println("Result size:"+result);
        System.out.println("Result:"+result);
    }

    public static List<String> printPerms(String str) {
        List<String> result = new ArrayList<>();
        Map<Character,Integer> map = buildFreqTable(str);
        System.out.println("map:"+map);
        printPerms(map,"",str.length(),result);
        return result;
    }

    public static Map<Character,Integer> buildFreqTable(String str) {
        Map<Character,Integer> freqTable = new HashMap<>();
        for(Character ch : str.toCharArray()) {
            if(!freqTable.containsKey(ch)) {
                freqTable.put(ch, 0);
            }
            freqTable.put(ch,freqTable.get(ch)+1);
        }
        return freqTable;
    }

    public static void printPerms(Map<Character,Integer> map, String prefix, int remaining, List<String> result) {
        // Base case
        if(remaining ==  0) {
            result.add(prefix);
            return;
        }

        for(Character ch : map.keySet()) {
            int count = map.get(ch);
            if(count > 0) {
                map.put(ch,count-1);
                printPerms(map,prefix + ch,remaining-1,result);
                map.put(ch,count);
            }
        }
    }
}
