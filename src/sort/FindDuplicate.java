package sort;

/**
 * 注释：发现重复整数
 * 时间：2022/7/2 0002 16:14
 * 作者：郭翰林
 */
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/find-the-duplicate-number
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
