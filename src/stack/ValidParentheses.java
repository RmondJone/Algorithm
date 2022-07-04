package stack;

import java.util.Stack;

/**
 * 注释：有效括号
 * 时间：2022/7/4 0004 12:31
 * 作者：郭翰林
 */
//https://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8ccc2?tpId=308&tqId=726&ru=/exam/oj&qru=/ta/algorithm-start/question-ranking&sourceUrl=%2Fexam%2Foj%3Fpage%3D1%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D308
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) return false;
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.charAt(i));
                continue;
            }
            if (stack.peek() == '(' && s.charAt(i) == ')') {
                stack.pop();
            } else if (stack.peek() == '[' && s.charAt(i) == ']') {
                stack.pop();
            } else if (stack.peek() == '{' && s.charAt(i) == '}') {
                stack.pop();
            } else {
                stack.add(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
