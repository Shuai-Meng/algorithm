package offer;

import basic.ListNode;
import basic.Stack;

/**
 * @Author: mengshuai
 * @Date: 2019.11.28 20:06
 * @Description:
 *  输入一个链表的头节点，从尾到头打印每个节点的值。
 */
public class Number6 {
	/**
	 * 很自然的会想到使用栈这种数据结构，利用其先进后出的特点，临时保存链表从头到尾每个节点，然后依次打印弹出的节点即可，但是需要额外的数据存储空间。
	 */
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

	/**
	 * 联想到递归本质上也是一种栈，只不过不需要显式的外部数据结构，由操作系统自己去创建函数调用链所需要的栈空间而已。然而这里有个缺点就是，链表很长的时候，可能导致栈溢出。
	 */
    public static void printRecursively(final ListNode head) {
        while (head.getNext() != null) {
            printRecursively(head.getNext());
        }
        System.out.println(head);
    }

	/**
	 * 最后一种方法，是直接先反转链表，然后从头打印即可。但是这会破坏原来的数据结构，虽然并不推荐，但是终归也是一种办法，比较暴力。
	 */
	 public static void printAfterRerverse(final ListNode head) {
		ListNode newHead = Number24.Reverse(head);
		while (newHead != null) {
			System.out.println(newHead);
			newHead = newHead.getNext();
		}
	 }
}
