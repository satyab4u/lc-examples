package test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Satya on 6/28/19.
 */
public class GenerateParenthesis {

    public static void main(String args[]) {
        int n = 3;
        List<String> result = generateParenthesis(3);
        System.out.println(result);
    }

    public static List<String> generateParenthesis(int n) {
       List<String> result = new ArrayList<>();
       generateParenthesis(3,3,"",result);
       return result;
    }

    public static void generateParenthesis(int leftParenCount, int rightParenCount, String currentString, List<String> result) {

        if(leftParenCount == 0 && rightParenCount == 0) {
            result.add(currentString);
        }

        if(leftParenCount > 0) {
            generateParenthesis(leftParenCount-1, rightParenCount, currentString+"(", result);
        }
        if(leftParenCount < rightParenCount) {
            generateParenthesis(leftParenCount, rightParenCount-1,currentString+")",result);
        }
    }
}
