package offer;

/**
 * @Author mengshuai
 * @Date 2019/9/13
 */
public class RepeatNumInArray {

    public static int findRepeat(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length || array[i] < 0) {
                throw new IndexOutOfBoundsException();
            }

            while (array[i] != i) {
                if (array[i] == array[array[i]]) {
                    return array[i];
                }
                swap(array, i, array[i]);
            }
        }
        return -1;
    }

    private static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
