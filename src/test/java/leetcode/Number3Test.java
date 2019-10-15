package leetcode;

import leetcode.medium.Number3;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/10/10
 */
public class Number3Test {

    @Test
    public void test() {
        Assert.assertEquals(0, Number3.lengthOfLongestSubstring(null));
        Assert.assertEquals(0, Number3.lengthOfLongestSubstring(""));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstring("u"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstring("hj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstring("hhj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstring("hjj"));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstring("bbbb"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstring("dvdf"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstring("pwwkew"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstring("abcabcbb"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstring("tmmzuxt"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstring("hkcpmprxxxqw"));
    }
}
