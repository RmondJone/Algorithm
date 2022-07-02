package string;

import java.util.HashMap;
import java.util.Map;

/**
 * 注释：最长无重复子字符串
 * 时间：2022/7/2 0002 10:44
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters/
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LongestWithoutRepeating {
    public static void main(String[] args) {
        String s = "维尔薇二翁热无若玩儿玩儿我二";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int res = 1;
        int start = 0;
        Map<Character, Integer> maps = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (maps.containsKey(ch)) {
                start = Math.max(start, maps.get(ch) + 1);
            }
            maps.put(ch, i);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}
