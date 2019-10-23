package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author mengshuai
 * @Date 2019/10/9
 */
public class Number3 {

    public static int lengthOfLongestSubstringA(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>(s.length());
        int res = s.length();
        int start = 0;
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) != null && map.get(s.charAt(i)) >= start) {
                int former = i - start;
                int latter = s.length() - 1 - map.get(s.charAt(i));

                max = former > max ? former : max;
                if (former >= latter) {
                    return max;
                }

                res = latter;
                start = map.get(s.charAt(i)) + 1;
            }
            map.put(s.charAt(i), i);
        }

        return max > res ? max : res;
    }

    /**
     * slide window
     */
    public static int lengthOfLongestSubstringB(String s) {
        if (s == null) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>(s.length());
        int max = 0;
        for (int start = 0, end = 0; end < s.length(); end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(start, map.get(s.charAt(end)) + 1);
            }
            map.put(s.charAt(end), end);
            max = Math.max(max, end - start + 1);
        }

        return max;
    }
}
