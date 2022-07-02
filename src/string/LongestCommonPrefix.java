package string;

/**
 * 注释：最长公共字符串
 * 时间：2022/7/2 0002 12:57
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/longest-common-prefix
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = new String[]{"flower", "flow", "flight"};
        System.out.println("最长公共字符串：" + longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            for (int j = 0; j < res.length() && j < strs[i].length(); j++) {
                index = j;
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, index);
            if (res.equals("")) return "";
        }
        return res;
    }
}
