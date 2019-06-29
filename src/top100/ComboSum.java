package top100;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Satya on 3/30/19.
 */
public class ComboSum {
    public static void main(String args[]) {
        int[] coins = {1,2,3};
        int money = 4;
        System.out.println("make change count:"+makeChange(coins,money));
    }

    public static int makeChange(int[] coins,int money) {
        Map<String,Integer> memo = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        return makeChange(coins,0,money,memo,result);
    }

    public static int makeChange(int[] coins,int index,int money,Map<String,Integer> memo,List<List<Integer>> result) {
        if(money == 0) return 1;
        if(index >= coins.length) return -1;
        int ways = 0;
        int amountOfCoin = 0;


        while(amountOfCoin <= money) {
            List<Integer> zeroSum = new ArrayList<>();
            int remaining = money - amountOfCoin;
            zeroSum.add(coins[index]);
            int returnVal = makeChange(coins,index+1,remaining,memo,result);
            amountOfCoin += coins[index];
            if(returnVal == 1) {
                result.add(zeroSum);
            }
        }
        System.out.println("result size:"+result.size());
        for(List<Integer> combo:result) {
            for(Integer val: combo) {
                System.out.print(val+ "->");
            }
            System.out.println("\n");
        }
        return result.size();
    }
}
