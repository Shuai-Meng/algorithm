package offer;

import basic.ListNode;
import basic.Stack;

/**
 * @Author: mengshuai
 * @Date: 2019.11.28 20:06
 */
public class Number6 {
    public static void printFromTailToHead(final ListNode head) {
        Stack stack = new Stack();

        ListNode cur = head;
        while (cur != null) {
            stack.push(cur);
            cur = cur.getNext();
        }

        while (stack.getSize() != 0) {
            System.out.println(stack.pop());
        }
    }

    public static void printRecursively(final ListNode head) {
        while (head.getNext() != null) {
            printRecursively(head.getNext());
        }
        System.out.println(head);
    }
}
