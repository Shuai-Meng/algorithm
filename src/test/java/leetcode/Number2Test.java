package leetcode;

import basic.ListNode;
import leetcode.medium.Number2;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/10/4
 */
public class Number2Test {
    private static ListNode l0, l1, l2, l3, l4, l5;

    @BeforeClass
    public static void prepare() {
        l1 = ListNode.generateList(new int[] {2, 4, 3});
        l2 = ListNode.generateList(new int[] {5, 6, 4});
        l3 = ListNode.generateList(new int[] {5, 6, 4, 7});
        l4 = ListNode.generateList(new int[] {3, 7});
        l5 = ListNode.generateList(new int[] {9, 2});
    }

    @Test
    public void testA() {
        Assert.assertEquals(null, Number2.addTwoNumbersA(l0, l0));
        Assert.assertTrue(l1.equals(Number2.addTwoNumbersA(l1, l0)));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8}).equals(Number2.addTwoNumbersA(l1, l2)));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8, 7}).equals(Number2.addTwoNumbersA(l1, l3)));
        Assert.assertTrue(ListNode.generateList(new int[] {2, 0, 1}).equals(Number2.addTwoNumbersA(l4, l5)));
    }

    @Test
    public void testB() {
        Assert.assertEquals(null, Number2.addTwoNumbersB(l0, l0));
        Assert.assertTrue(l1.equals(Number2.addTwoNumbersB(l1, l0)));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8}).equals(Number2.addTwoNumbersB(l1, l2)));
        Assert.assertTrue(ListNode.generateList(new int[] {7, 0, 8, 7}).equals(Number2.addTwoNumbersB(l1, l3)));
        Assert.assertTrue(ListNode.generateList(new int[] {2, 0, 1}).equals(Number2.addTwoNumbersB(l4, l5)));
    }
}
