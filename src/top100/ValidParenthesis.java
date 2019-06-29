package top100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Satya on 3/24/19.
 */
public class ValidParenthesis {

    public static void main(String args[]) {
        String s = "()";
        System.out.println("is valid:"+isValid(s));
    }

    public static boolean isValid(String s) {
        Map<Character,Character> bracketMap = new HashMap<>();
        bracketMap.put('}','{');
        bracketMap.put(')','(');
        bracketMap.put('[',']');

        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()) {
            if(bracketMap.containsKey(ch)) {
                if(stack.peek() == bracketMap.get(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.add(ch);
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
