package leetcode.medium;

import basic.ListNode;

/**
 * @Author mengshuai
 * @Date 2019/9/28
 */
public class Number2 {

    public static ListNode addTwoNumbersA(final ListNode l1, final ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = l1, q = l2, res = listNode;

        int carry = 0;
        while (p != null && q != null) {
            int val = p.getVal()+ q.getVal() + carry;
            listNode.setNext(new ListNode(val % 10));
            carry = val / 10;

            p = p.getNext();
            q = q.getNext();
            listNode = listNode.getNext();
        }


        ListNode tail = p == null ? q : p;
        if (carry == 0) {
            listNode.setNext(tail);
        } else {
            listNode.setNext(addTwoNumbersA(new ListNode(1), tail));
        }

        return res.getNext();
    }

    public static ListNode addTwoNumbersB(final ListNode l1, final ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode p = l1, q = l2, res = listNode;

        int carry = 0;
        while (p != null || q != null) {
            int x = 0, y = 0;

            if (p != null) {
                x = p.getVal();
                p = p.getNext();
            }
            if (q != null) {
                y = q.getVal();
                q = q.getNext();
            }

            int sum = x + y + carry;
            carry = sum / 10;
            listNode.setNext(new ListNode(sum % 10));
            listNode = listNode.getNext();
        }

        if (carry > 0) {
            listNode.setNext(new ListNode(carry));
        }
        return res.getNext();
    }
}
