package leetcode.medium;

/**
 * @Author mengshuai
 * @Date 2019/11/23
 */
public class Number34 {

    /**
     * 基本思路就是二分查找，因为出现了关键字"排序"和log(n)。
     * 但是和基本二分查找不同，排序数组中有重复数字，现在要找出边界；
     * 而在基本二分查找中，找到一个target就可以返回下标了；现在则是
     * "药不能停"，找到target后，还要向前及向后搜索，找出边界。
     * 但是上界或下界不可能在一次二分查找中完成，需要分开获取，故整体
     * 上是2log(n)，去掉常数系数后，数量级仍然是log(n)。
     *
     * 动手之前先写好测试用例，列出边界条件和特殊情况，省的最后忘了。
     * ([], 8)
     * ([2], 2)
     * ([2,3], 1)
     * ([2,3], 4)
     * ([2,3], 3)
     * ([2,3], 2)
     */
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[] {-1, -1};
        }

        return new int[] {findMin(nums, target), findMax(nums, target)};
    }

    /**
     * 关键的是要想好终止条件，向左（小）压缩空间，每次压缩至原来的一半，
     * 最终的情况就是start == end == mid，压缩到一个点上；对于普通
     * 的二分查找，终止条件是start <= end，那是因为要在循环内部拿到结
     * 果，要在内部出现start == end这种情况，如果此时就终止，mid ==
     * start == end - 1，那么end会被漏掉；但是对于求边界，是在循环
     * 结束之后，外部判断结果，循环内部只负责缩小范围，需要保证循环结束后，
     * 恰好start == end，而不是start == end + 1导致越界，所以求边
     * 界时，终止条件是start < end。
     * 确定了终止条件，初始值也就确定了，start为0没什么争议，关键是end
     * 是arr.length，考虑要遍历最后一个元素的极端情况，此时start ==
     * arr.length - 1， end == arr.length - 1，
     */
    private static int findMin(int[] arr, int target) {
        int start = 0, end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] == target) {
                end = mid;
            } else if (arr[mid] > target) {
                 end = mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            }
        }

        if (start == arr.length) {
            return -1;
        }

        return arr[start] == target ? start : -1;
    }

    private static int findMax(int arr[], int target) {
        int start = 0, end = arr.length;

        while (start < end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                start = mid + 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid;
            }
        }

        if (start == 0) {
            return -1;
        }

        return arr[start - 1] == target ? start - 1 : -1;
    }
}
