package string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * 注释：最长字符串链
 * 时间：2022/7/2 0002 9:56
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/longest-string-chain
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LongestStringChain {
    public static void main(String[] args) {
        String[] words = new String[]{"c", "cd", "ab", "bcd", "abc", "abcd", "abcde"};
        System.out.println("最长字符串链长度是：" + longestStrChain(words));
    }

    public static int longestStrChain(String[] words) {
        int res = 1;
        Map<String, Integer> maps = new HashMap<>();
        Arrays.sort(words, Comparator.comparingInt(String::length));
        for (String word : words) {
            int num = 1;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String ele = sb.toString();
                if (maps.containsKey(ele)) {
                    num = Math.max(num, maps.get(ele) + 1);
                }
                maps.put(word, num);
                res = Math.max(res, num);
            }
        }
        return res;
    }
}
