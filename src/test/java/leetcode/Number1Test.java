package leetcode;

import leetcode.easy.Number1;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/9/28
 */
public class Number1Test {


    private int[] nums = {2,7,11,15};
    private int target = 9;

    @Test
    public void testAlpha() {
        int[] res = Number1.twoSumA(nums, target);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(1, res[1]);
    }

    @Test
    public void testBeta() {
        int[] res = Number1.twoSumB(nums, target);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(1, res[1]);
    }
}
