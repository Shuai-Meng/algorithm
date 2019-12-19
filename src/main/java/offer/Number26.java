package offer;

import basic.TreeNode;

/**
 * @Author: mengshuai
 * @Date: 2019.12.03 11:48
 */
public class Number26 {
    public static boolean isSubTree(final TreeNode<Integer> root1, final TreeNode<Integer> root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.getData().equals(root2.getData())) {
            return compareSub(root1, root2);
        }

        if (isSubTree(root1.getLeft(), root2)) {
            return true;
        }

        return isSubTree(root1.getRight(), root2);
    }

    private static boolean compareSub(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null) {
            return false;
        }

        if (root2 == null) {
            return false;
        }

        if (!root1.getData().equals(root2.getData())) {
            return false;
        }

        return compareSub(root1.getLeft(), root2.getLeft()) &&
                compareSub(root1.getRight(), root2.getRight());
    }
}
