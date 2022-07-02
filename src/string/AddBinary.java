package string;

/**
 * 注释：二进制求和
 * 时间：2022/7/2 0002 14:32
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/add-binary
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class AddBinary {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ca = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = ca;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            sb.append(sum % 2);
            ca = sum / 2;
        }
        if (ca == 1) sb.append(ca);
        return sb.reverse().toString();
    }
}
