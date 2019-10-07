package leetcode;

import leetcode.easy.Number1;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author mengshuai
 * @Date 2019/9/28
 */
public class Number1Test {


    @Test
    public void testA() {
        int[] nums = {2,7,11,15};

        int[] res = Number1.twoSumA(nums, 9);
        Assert.assertTrue(Arrays.equals(new int[] {0, 1}, res));

        nums = new int[] {3, 3};
        res = Number1.twoSumA(nums, 6);
        Assert.assertTrue(Arrays.equals(new int[] {0, 1}, res));
    }

    @Test
    public void testB() {
        int[] nums = {2,7,11,15};
        int[] res = Number1.twoSumB(nums, 9);
        Assert.assertTrue(Arrays.equals(new int[] {1, 0}, res));

        nums = new int[] {3, 3};
        res = Number1.twoSumB(nums, 6);
        Assert.assertTrue(Arrays.equals(new int[] {1, 0}, res));
    }
}
