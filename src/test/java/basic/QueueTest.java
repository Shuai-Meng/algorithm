package basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/12/1
 */
public class QueueTest {
    private static Queue<Integer> queue = new Queue<>(2);

    @Test
    public void test() {
        queue.enqueue(1);
        queue.enqueue(2);
        Assert.assertEquals(2, queue.getSize());

        Assert.assertEquals(1, (int) queue.dequeue());
        Assert.assertEquals(1, queue.getSize());
        Assert.assertEquals(2, (int) queue.dequeue());
        Assert.assertEquals(0, queue.getSize());

        queue.enqueue(4);
        Assert.assertEquals(1, queue.getSize());
    }
}
