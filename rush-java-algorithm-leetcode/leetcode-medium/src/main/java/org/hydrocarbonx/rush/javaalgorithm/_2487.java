package org.hydrocarbonx.rush.javaalgorithm;

import java.util.*;

/**
 * @author zouzhenfeng
 * @since 2024-01-03
 */
public class _2487 {

    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> stack = new LinkedList<>();
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        // 不为 null
        while (head != null) {
            // 栈不为空，且栈顶元素小于当前元素
            while (!stack.isEmpty() && stack.peek().val < head.val) {
                // 出栈
                stack.pop();
            }
            // 当前元素入栈
            stack.push(head);

            // 下一个元素
            head = head.next;
        }

        // 栈内元素拼装回链表
        while (!stack.isEmpty()) {
            tail.next = stack.removeLast();
            tail = tail.next;
        }

        tail.next = null;
        return dummy.next;
    }
}
