package top100;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Satya on 3/27/19.
 */
public class CoinsProblem {
    public static void main(String args[]) {
        int[] coins = {1,2,3};
        int money = 4;
        System.out.println("make change count:"+makeChange(coins,money));
    }

    public static int makeChange(int[] coins,int money) {
        Map<String,Integer> memo = new HashMap<>();
       return makeChange(coins,0,money,memo);
    }

    public static int makeChange(int[] coins,int index,int money,Map<String,Integer> memo) {
        if(money == 0) return 1;
        if(index >= coins.length) return 0;
        int ways = 0;
        int amountOfCoin = 0;
        String key = money+"-"+index;
        if(memo.containsKey(key)) {
            return memo.get(key);
        }
        while(amountOfCoin <= money) {
            int remaining = money - amountOfCoin;
            ways += makeChange(coins,index+1,remaining,memo);
            amountOfCoin += coins[index];
        }
        memo.put(key,ways);
        return ways;
    }
}
