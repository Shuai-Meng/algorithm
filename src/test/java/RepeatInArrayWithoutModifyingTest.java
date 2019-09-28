import offer.RepeatInArrayWithoutModifying;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/9/13
 */
public class RepeatInArrayWithoutModifyingTest {

    @Test
    public void test() {
        int[] a = {2, 3, 5, 4, 3, 2, 6, 7};
        Assert.assertEquals(3, RepeatInArrayWithoutModifying.findRepeat(a));
    }
}
