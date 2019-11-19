package basic.list;

/**
 * @Author mengshuai
 * @Date 2019/11/20
 */
public class FindCircle {

    /**
     * tail's next is not null, so you can't know where is tail in one traverse,
     * unless you save each node in hash.
     * @param head
     * @return null if no circle, or entry if circle exists
     */
    public static ListNode find(final ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head, slow = head;
        while (fast != null) {
            ListNode tmp = fast.getNext();
            if (tmp == null) {
                return null;
            }

            if (fast == slow) {
                break;
            }

            fast = tmp.getNext();
            slow = slow.getNext();
        }

        if (fast == null) {
            return null;
        }

        int count = 1;
        slow = fast;
        while (slow != fast) {
            slow = slow.getNext();
            count++;
        }

        fast = slow = head;
        for (int i = 0; i < count; i++) {
            fast = fast.getNext();
        }

        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return fast;
    }
}
