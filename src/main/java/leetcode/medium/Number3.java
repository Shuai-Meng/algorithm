package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author mengshuai
 * @Date 2019/10/9
 */
public class Number3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int res = s.length();
        int start = 0;
        int max = 0;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.get(c) != null && map.get(c) >= start) {
                int former = i - start;
                int latter = s.length() - 1 - map.get(c);

                max = former > max ? former : max;
                if (former >= latter) {
                    return max;
                }

                res = latter;
                start = map.get(c) + 1;
            }
            map.put(c, i);
        }

        return max > res ? max : res;
    }
}
