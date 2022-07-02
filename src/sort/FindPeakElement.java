package sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 注释：发现峰值元素
 * 时间：2022/7/2 0002 15:48
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/find-peak-element
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums));
    }

    public static int findPeakElement(int[] nums) {
        Map<Integer, Integer> maps = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            maps.put(nums[i], i);
        }
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        return maps.get(max);
    }
}
