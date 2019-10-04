package leetcode;

import basic.list.ListNode;
import leetcode.medium.Number2;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/10/4
 */
public class Number2Test {

    @Test
    public void test() {
        ListNode l1 = ListNode.generateList(new int[] {2, 4, 3});
        ListNode l2 = ListNode.generateList(new int[] {5, 6, 4});
        ListNode l3 = ListNode.generateList(new int[] {5, 6, 4, 7});
        ListNode l4 = ListNode.generateList(new int[] {3, 7});
        ListNode l5 = ListNode.generateList(new int[] {9, 2});

        Assert.assertEquals(null, Number2.addTwoNumbers(null, null));
        Assert.assertTrue(Number2.addTwoNumbers(l1, null).equals(l1));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8}).equals(Number2.addTwoNumbers(l1, l2)));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8, 7}).equals(Number2.addTwoNumbers(l1, l3)));
        Assert.assertTrue(ListNode.generateList(new int[] {2, 0, 1}).equals(Number2.addTwoNumbers(l4, l5)));
    }
}
