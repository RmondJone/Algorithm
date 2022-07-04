package stack;

import java.util.Stack;

/**
 * 注释：点击消除
 * 时间：2022/7/4 0004 15:12
 * 作者：郭翰林
 */
//https://www.nowcoder.com/practice/8d3643ec29654cf8908b5cf3a0479fd5?tpId=308&tqId=952218&ru=/exam/oj&qru=/ta/algorithm-start/question-ranking&sourceUrl=%2Fexam%2Foj%3Fpage%3D1%26tab%3D%25E7%25AE%2597%25E6%25B3%2595%25E7%25AF%2587%26topicId%3D308
public class ClickClean {
    public static void main(String[] args) {
        String string = "abba";
        System.out.println(doClickClear(string));
    }

    public static String doClickClear(String s) {
        StringBuilder builder = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty() || s.charAt(i) != stack.peek()) {
                stack.add(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        if (stack.isEmpty()) return "0";
        while (!stack.isEmpty()) builder.append(stack.pop());
        builder.reverse();
        return builder.toString();
    }
}
