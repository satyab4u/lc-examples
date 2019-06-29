package top100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Satya on 4/2/19.
 */
public class ComboSumProblem {

    public static void main(String args[]) {
        int[] candidates = {2,3,5};
        int target = 8;
        List<List<Integer>> results= comboSum(candidates,target);

        for(List<Integer> combo : results) {
            for (Integer val:combo) {
                System.out.print(val+"->");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> comboSum(int[] candidates, int target) {

        List<List<Integer>> results = new ArrayList<>();

        if(candidates == null || candidates.length == 0) return results;

        Arrays.sort(candidates);

        List<Integer> combination = new ArrayList<>();
        comboSum(results,combination,candidates,target,0);
        return results;

    }

    public static void comboSum(List<List<Integer>> results,List<Integer> combination, int[] candidates,int target,int startIndex) {

        if(target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for(int i = startIndex;i<candidates.length;i++) {
            if(candidates[i] > target) {
                break;
            }
            combination.add(candidates[i]);
            comboSum(results,combination,candidates,target-candidates[i],i);
            combination.remove(combination.size()-1);
        }
    }
}
