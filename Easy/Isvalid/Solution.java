package Easy.Isvalid;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public static boolean isValid(String s) {
        Stack<Character> res = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '{' || temp == '[') {
                res.add(temp);
            } else if (temp == ')' && res.pop() != '(') {
                return false;
            } else if (temp == '}' && res.pop() != '{') {
                return false;
            } else if (temp == ']' && res.pop() != '[') {
                return false;
            } else if (res.empty()) {
                return false;
            }
        }

        if (!res.empty() || s.length() <= 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] str) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("(("));
        System.out.println(isValid("("));
        System.out.println(isValid("}"));
        System.out.println(isValid(")(){}"));
    }
}
