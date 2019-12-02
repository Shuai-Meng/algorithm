package offer;

/**
 * @Author mengshuai
 * @Date 2019/12/1
 */
public class Number33 {
    public static boolean whetherBTree(int[] arr, int start, int end) {
        if (arr == null || start > end) {
            return false;
        }

        int root = arr[end];
        int i= start;
        while (i< end && arr[i] < root) {
            i++;
        }

        int j = i;
        while (j < end && arr[j] > root) {
            j++;
        }

        if (j < end) {
            return false;
        }

        boolean left = whetherBTree(arr, start, i - 1);
        boolean right = whetherBTree(arr, i, end - 1);
        return left && right;
    }
}
