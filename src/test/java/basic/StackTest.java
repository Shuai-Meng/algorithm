package basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class StackTest {

    @Test
    public void testPush() {
        Stack<Integer> stack = new Stack(2);

        Assert.assertEquals(0, stack.getSize());
        stack.push(1);
        stack.push(4);
        Assert.assertEquals(2, stack.getSize());
        Assert.assertEquals(4, (int) stack.top());
        stack.push(5);
        Assert.assertEquals(3, stack.getSize());
    }

    @Test(expected = StackOverflowError.class)
    public void testPop() {
        Stack<Integer> stack = new Stack(2);
        stack.pop();
        stack.push(6);
        Assert.assertEquals(1, stack.getSize());
        Assert.assertEquals(6, (int) stack.pop());
    }
}
