package leetcode;

import leetcode.medium.Number34;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/11/24
 */
public class Number34Test {
    private int[] nums;
    private int target;
    private int[] res;

    @Test
    public void test() {
        nums = new int[]{};
        target = 9;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(-1, res[0]);
        Assert.assertEquals(-1, res[1]);

        nums = new int[] {4};
        target = 4;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(0, res[1]);

        nums = new int[] {2, 3};
        target = 1;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(-1, res[0]);
        Assert.assertEquals(-1, res[1]);

        target = 4;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(-1, res[0]);
        Assert.assertEquals(-1, res[1]);

        nums = new int[] {5,7,7,8,8,10};
        target = 8;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(3, res[0]);
        Assert.assertEquals(4, res[1]);

        target = 6;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(-1, res[0]);
        Assert.assertEquals(-1, res[1]);

        target = 10;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(5, res[0]);
        Assert.assertEquals(5, res[1]);

        target = 5;
        res = Number34.searchRange(nums, target);
        Assert.assertEquals(0, res[0]);
        Assert.assertEquals(0, res[1]);
    }
}
