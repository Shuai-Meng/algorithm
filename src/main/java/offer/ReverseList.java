package offer;

import basic.list.ListNode;
import basic.stack.Stack;

import java.util.List;

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

    public static ListNode reverse2(final ListNode head) {
        ListNode res = null;
        ListNode cur = head;
        ListNode prev = null;

        while (cur != null) {
            ListNode next = cur.getNext();
            if (next == null) {
                res = cur;
            }

            cur.setNext(prev);

            prev = cur;
            cur = next;
        }

        return res;
    }

    public static ListNode reverse3(final ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode node = head;

        while (node != null) {
            stack.push(node);
            node = node.getNext();
        }

        ListNode res = new ListNode();
        ListNode tmp = res;
        while (stack.getSize() != 0) {
            res.setNext(stack.pop());
            res = res.getNext();
        }

        return tmp.getNext();
    }
}
