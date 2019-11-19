package offer;

/**
 * @Author mengshuai
 * @Date 2019/11/17
 */
public class Number25 {
    public static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int k = 0;
        int len = arr1.length > arr2.length ? arr2.length : arr1.length;
        for (int i = 0, j = 0; i < len;) {
            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        if (arr1.length > arr2.length) {
            for (; k < arr1.length; k++) {
                result[k] = arr1[k];
            }
        } else {
            for (; k < arr2.length; k++) {
                result[k] = arr2[k];
            }
        }

        return result;
    }
}
