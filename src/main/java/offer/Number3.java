package offer;

/**
 * @Author: mengshuai
 * @Date: 2019.11.27 17:28
 */
public class Number3 {
    public static int findRepeatNumberInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new NullPointerException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array.length || array[i] < 0) {
                throw new IndexOutOfBoundsException();
            }

            while (array[i] != i) {
                //there are two array[i], duplicated
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

    public static int findRepeat(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int[] b = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 1 || array[i] >= array.length) {
                throw new IndexOutOfBoundsException();
            }

            int index = array[i];
            if (b[index] == 0) {
                b[index] = index;
            } else {
                return index;
            }
        }

        return 0;
    }
}
