package offer;

import basic.list.ListNode;

/**
 * @Author mengshuai
 * @Date 2019/11/25
 */
public class Number22 {
    public static ListNode findLastKNode(final ListNode head, int k) {
        if (head == null || k <= 0) {
            return null;
        }

        ListNode fast = head;
        for (int i = 0; i < k - 1; i++) {
            if (fast.getNext() == null) {
                return null;
            }
            fast = fast.getNext();
        }

        ListNode slow = head;
        while (fast.getNext() != null) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return slow;
    }
}
