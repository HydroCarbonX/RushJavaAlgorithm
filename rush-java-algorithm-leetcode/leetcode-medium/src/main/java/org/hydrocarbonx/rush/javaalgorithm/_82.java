package org.hydrocarbonx.rush.javaalgorithm;

/**
 * @author zouzhenfeng
 * @since 2024-01-15
 */
public class _82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            // 如果 cur.next 和 cur.next.next 是重复元素
            if (cur.next.val == cur.next.next.val) {
                // 记录重复元素的值
                int x = cur.next.val;
                // 一直删除重复元素
                while (cur.next != null && cur.next.val == x) {
                    cur.next = cur.next.next;
                }
            } else {
                // 如果 cur.next 和 cur.next.next 不是重复元素
                // 则 cur 向后移动一位
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
