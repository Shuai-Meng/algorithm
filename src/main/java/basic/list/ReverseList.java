package basic.list;

/**
 * @Author mengshuai
 * @Date 2019/11/20
 */
public class ReverseList {
    public static ListNode reverse(final ListNode head) {
        ListNode res = new ListNode();
        ListNode cur = head;

        while (cur != null) {
            ListNode tmp = cur.getNext();
            cur.setNext(res.getNext());
            res.setNext(cur);
            cur = tmp;
        }

        return res.getNext();
    }
}
