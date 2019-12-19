package leetcode;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @Author mengshuai
 * @Date 2019/12/8
 */
public class Nuber {
    public static void print(String[] arr) {
        int depth = arr.length / 3;
        if (arr.length % 3 != 0) {
            depth++;
        }

        for (int i = 0; i < depth; i++) {
            System.out.print(arr[i]);

            if (i + depth < arr.length) {
                System.out.print(' ' + arr[i + depth]);
            }

            if (i + depth * 2 < arr.length) {
                System.out.println(' ' + arr[i + depth * 2]);
            } else {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3);
        for (int a : list) {
            list.add(a);
        }
        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            iterator.remove();
        }
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            print(line.split(" "));
        }
    }
}
