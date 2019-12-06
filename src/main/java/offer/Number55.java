package offer;

import basic.TreeNode;

/**
 * @Author: mengshuai
 * @Date: 2019.12.03 10:33
 */
public class Number55 {
    public static int getDepth(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = getDepth(root.getLeft());
        int right = getDepth(root.getRight());

        return (left > right ? left : right) + 1;
    }

    public static boolean isBalancedTree(final TreeNode root) {
        if (root == null) {
            return false;
        }

        if (Math.abs(getDepth(root.getLeft()) - getDepth(root.getRight())) > 1) {
            return false;
        }
        return isBalancedTree(root.getLeft()) && isBalancedTree(root.getRight());
    }

    public static boolean isBalancedTree2(final TreeNode root) {
        return true;
    }
}
