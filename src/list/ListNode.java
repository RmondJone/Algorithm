package list;

/**
 * 注释：链表
 * 时间：2022/7/4 0004 15:56
 * 作者：郭翰林
 */
public class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        ListNode listNode = this;
        while (listNode.next != null) {
            builder.append(listNode.val + " ");
            listNode = listNode.next;
        }
        builder.append(listNode.val);
        return builder.toString();
    }
}
