package offer;

import basic.list.ListNode;

/**
 * @Author: mengshuai
 * @Date: 2019.11.25 20:20
 */
public class Number23 {
    public static ListNode findEntryOfCircleList(final ListNode head) {
        ListNode slow = head;
        ListNode fast = slow;

        while (fast != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();

            if (fast == slow) {
                break;
            }
        }

        if (fast == null) {
            return null;
        }

        int len = 1;
        while (fast.getNext() != slow) {
            fast = fast.getNext();
            len++;
        }

        fast = head;
        while (len >= 0) {
            fast = fast.getNext();
            len--;
        }

        slow = head;
        while (fast != slow) {
            fast = fast.getNext();
            slow = slow.getNext();
        }

        return fast;
    }
}
