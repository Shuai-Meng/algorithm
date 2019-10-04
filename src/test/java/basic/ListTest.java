package basic;

import basic.list.ListNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/10/4
 */
public class ListTest {
    @Test
    public void test() {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(1);
        ListNode four = ListNode.generateList(new int[] {2,1});
        ListNode five = ListNode.generateList(new int[] {1,2});
        ListNode six = ListNode.generateList(new int[] {1, 2});

        Assert.assertTrue(one.equals(three));
        Assert.assertTrue(!one.equals(two));
        Assert.assertFalse(one.equals(four));
        Assert.assertFalse(four.equals(five));
        Assert.assertTrue(five.equals(six));
    }
}
