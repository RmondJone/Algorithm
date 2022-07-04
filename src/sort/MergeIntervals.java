package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 注释：合并区间
 * 时间：2022/7/4 0004 9:35
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/merge-intervals
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = new int[][]{
                new int[]{1, 3},
                new int[]{2, 6},
                new int[]{8, 10},
                new int[]{15, 18},
        };
        System.out.println(Arrays.deepToString(merge(intervals)));
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();
        if (intervals.length == 0 || intervals == null) return res.toArray(new int[0][]);
        int i = 0;
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        while (i < intervals.length) {
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i < intervals.length - 1 && right > intervals[i + 1][0]) {
                i++;
                right = Math.max(right, intervals[i][1]);
            }
            i++;
            res.add(new int[]{left, right});
        }
        return res.toArray(new int[0][]);
    }
}
