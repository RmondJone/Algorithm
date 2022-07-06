package list;

/**
 * 注释：反转链表
 * 时间：2022/7/4 0004 15:57
 * 作者：郭翰林
 */
public class ReverserList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode tempNode = listNode;
        for (int i = 2; i < 10; i++) {
            tempNode.next = new ListNode(i);
            tempNode = tempNode.next;
        }
        System.out.println(reverserList(listNode));
    }

    public static ListNode reverserList(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
