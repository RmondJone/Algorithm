package string;

/**
 * 注释：indexOf函数实现
 * 时间：2022/7/2 0002 13:31
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/implement-strstr
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class IndexOfImpl {
    public static void main(String[] args) {
        System.out.println(strStr("aaa", "aaaaaaa"));
    }

    public static int strStr(String haystack, String needle) {
        int res = -1;
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                res = i;
                break;
            }
        }
        return res;
    }
}
