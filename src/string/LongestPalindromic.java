package string;

/**
 * 注释：最长回文字符串
 * 时间：2022/7/2 0002 11:47
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode.cn/problems/longest-palindromic-substring/
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LongestPalindromic {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println("最长回文字符串:" + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int maxlength = 1;
        for (int len = 2; len <= s.length(); len++) {
            for (int i = 0; i + len <= s.length(); i++) {
                int j = i + len - 1;
                if (len > maxlength && check(chars, i, j)) {
                    left = i;
                    maxlength = len;
                }
            }
        }
        return s.substring(left, left + maxlength);
    }

    /**
     * 检测是否是回文字符串
     *
     * @param chars
     * @param l
     * @param r
     * @return
     */
    public static boolean check(char[] chars, int l, int r) {
        while (l < r) {
            if (chars[l] != chars[r]) return false;
            l++;
            r--;
        }
        return true;
    }
}
