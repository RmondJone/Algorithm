package string;

/**
 * 注释：字符串z型变换
 * 时间：2022/7/2 0002 12:21
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/zigzag-conversion/
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class ZigzagConversion {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 3));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int i = 0, flag = -1;
        for (char ch : s.toCharArray()) {
            rows[i].append(ch);
            if (i == 0 || i == numRows - 1) flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
