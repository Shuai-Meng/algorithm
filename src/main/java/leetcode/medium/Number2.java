package leetcode.medium;

import basic.list.ListNode;

/**
 * @Author mengshuai
 * @Date 2019/9/28
 */
public class Number2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode res = listNode;

        int overflow = 0;
        while (l1 != null && l2 != null) {
            int val = l1.getVal()+ l2.getVal() + overflow;
            listNode.setNext(new ListNode(val >= 10 ? val - 10 : val));
            overflow = val >= 10 ? 1 : 0;

            l1 = l1.getNext();
            l2 = l2.getNext();
            listNode = listNode.getNext();
        }


        ListNode tail = l1 == null ? l2 : l1;
        if (overflow == 0) {
            listNode.setNext(tail);
        } else {
            listNode.setNext(addTwoNumbers(new ListNode(1), tail));
        }

        return res.getNext();
    }
}
