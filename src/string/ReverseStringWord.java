package string;

import java.util.Arrays;
import java.util.Collections;

/**
 * 注释：反转字符串
 * 时间：2022/7/2 0002 10:30
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/reverse-words-in-a-string
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class ReverseStringWord {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}
