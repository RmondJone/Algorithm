package sort;

import java.util.Arrays;

/**
 * 注释：最大数
 * 时间：2022/7/2 0002 15:16
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/largest-number
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 30, 34, 5, 9};
        System.out.println(largestNumber(nums));
    }

    public static String largestNumber(int[] nums) {
        String[] ss = new String[nums.length];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = "" + nums[i];
        }
        Arrays.sort(ss, (a, b) -> {
            String sa = a + b;
            String sb = b + a;
            return sb.compareTo(sa);
        });
        if (ss[0].equals("0")) return "0";
        StringBuilder res = new StringBuilder();
        for (String s : ss) res.append(s);
        return res.toString();
    }
}
