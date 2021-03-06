package offer;

import offer.Number3;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/9/13
 */
public class Number3Test {

    @Test
    public void test() {
        int[] a = new int[] {2, 3, 1, 0, 2, 5, 3};
        Assert.assertEquals(2, Number3.findRepeat(a));
        a = new int[] {6, 5, 1, 4, 2, 4, 3};
        Assert.assertEquals(4, Number3.findRepeat(a));
        a = new int[] {6, 5, 1, 4, 2, 0, 3};
        Assert.assertEquals(-1, Number3.findRepeat(a));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExp() {
        int[] a = new int[] {1, 2, 3};
        Number3.findRepeat(a);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testExp1() {
        int[] a = new int[] {-1, 2, 3};
        Number3.findRepeat(a);
    }

    @Test(expected = NullPointerException.class)
    public void testExp2() {
        int[] a = new int[]{};
        Number3.findRepeat(a);
    }

    @Test(expected = NullPointerException.class)
    public void testExp3() {
        Number3.findRepeat(null);
    }
}
