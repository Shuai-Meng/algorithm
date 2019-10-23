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
    public void testA() {
        Assert.assertEquals(0, Number3.lengthOfLongestSubstringA(null));
        Assert.assertEquals(0, Number3.lengthOfLongestSubstringA(""));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstringA("u"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringA("hj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringA("hhj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringA("hjj"));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstringA("bbbb"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringA("dvdf"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringA("pwwkew"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringA("abcabcbb"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstringA("tmmzuxt"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstringA("hkcpmprxxxqw"));
    }

    @Test
    public void testB() {
        Assert.assertEquals(0, Number3.lengthOfLongestSubstringB(null));
        Assert.assertEquals(0, Number3.lengthOfLongestSubstringB(""));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstringB("u"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringB("hj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringB("hhj"));
        Assert.assertEquals(2, Number3.lengthOfLongestSubstringB("hjj"));
        Assert.assertEquals(1, Number3.lengthOfLongestSubstringB("bbbb"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringB("dvdf"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringB("pwwkew"));
        Assert.assertEquals(3, Number3.lengthOfLongestSubstringB("abcabcbb"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstringB("tmmzuxt"));
        Assert.assertEquals(5, Number3.lengthOfLongestSubstringB("hkcpmprxxxqw"));
    }
}
