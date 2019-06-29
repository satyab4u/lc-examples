package top100;

import java.util.ArrayList;

/**
 * Created by Satya on 3/24/19.
 */
public class GenerateParenthesis {

    public static void main(String args[]) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", 3, 3);

        result.forEach(System.out::println);

    }

    public static void dfs(ArrayList<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }
}
