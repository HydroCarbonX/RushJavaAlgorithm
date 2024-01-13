package org.hydrocarbonx.rush.javaalgorithm;

import java.util.Objects;

/**
 * @author HydroCarbon
 * @since 2024-01-14
 */
public class _83 {

    public ListNode deleteDuplicates(ListNode head) {

        if (Objects.isNull(head)) {
            return null;
        }

        ListNode cur = head;
        while (Objects.nonNull(cur.next)) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
