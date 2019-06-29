package code;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by Satya on 6/24/19.
 */
public class ValidParenthesis {

    public static void main(String args[]) {
       String s = "{[]}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      for(char ch: s.toCharArray()) {
          if( ch == '{' || ch =='[' || ch == '('){
              stack.push(ch);
          } else {
              if(!stack.isEmpty() && isPair(stack.peek(), ch)) {
                  stack.pop();
              } else {
                  return false;
              }
          }
      }
      return stack.isEmpty();
    }

    public static boolean isPair(char c1, char c2) {
        return ((c1 == '{' && c2 =='}') || (c1 == '[' && c2 ==']' || (c1 == '(' && c2 ==')')));
    }

}
