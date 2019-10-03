package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author mengshuai
 * @Date 2019/9/28
 */
public class Number1 {

    /**
     * time: O(n ^ 2), space: O(1)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumA(int[] nums, int target) {
        if (nums == null) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    /**
     * time: O(n), space: O(n)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumB(int[] nums, int target) {
        if (nums == null) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>(1);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.get(complement) != null && complement != nums[i]) {
                return new int[]{i, map.get(complement)};
            } else {
                map.put(nums[i], i);
            }
        }

        return null;
    }
}
