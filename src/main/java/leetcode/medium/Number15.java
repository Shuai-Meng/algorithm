package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author mengshuai
 * @Date 2019/12/7
 */
public class Number15 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length < 3) {
            return result;
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int k = nums.length - 1;
            int j = i + 1;

            while (j < k) {
                if (j > 2 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if (k < nums.length - 1 && nums[k] == nums[k + 1]) {
                    continue;
                }

                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }

        }

        return result;
    }
}
