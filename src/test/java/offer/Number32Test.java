package offer;

import basic.TreeNode;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/12/1
 */
public class Number32Test {

    private static TreeNode<Integer> root;

    @BeforeClass
    public static void init() {
        TreeNode<Integer>[] arr = new TreeNode[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = new TreeNode<>(i + 1);
        }

        root = TreeNode.createTree(arr);
    }

    @Test
    public void testPrint() {
        Number32.printFromTopToButtom(root);
    }

    @Test
    public void testPrintWithTier() {
        Number32.printWithLineFeed(root);
    }

    @Test
    public void testSnakePrint() {
        Number32.printLikeSnake(root);
    }
}
