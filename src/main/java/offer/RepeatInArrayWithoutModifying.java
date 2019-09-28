package offer;

/**
 * @Author mengshuai
 * @Date 2019/9/13
 */
public class RepeatInArrayWithoutModifying {

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
