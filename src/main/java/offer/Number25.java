package offer;

import basic.ListNode;

/**
 * @Author mengshuai
 * @Date 2019/11/17
 */
public class Number25 {
    public static ListNode mergeSortedList(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        ListNode result;
        if (list1.getVal() < list2.getVal()) {
            result = list1;
            result.setNext(mergeSortedList(list1.getNext(), list2));
        } else {
            result = list2;
            result.setNext(mergeSortedList(list1, list2.getNext()));
        }

        return result;
    }
}

