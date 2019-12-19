package offer;

import basic.TreeNode;

/**
 * @Author mengshuai
 * @Date 2019/12/6
 */
public class Number28 {
    public static boolean isSymmetrical(TreeNode<Integer> root) {
        return isSymmetrical(root, root);
    }

    private static boolean isSymmetrical(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null) {
            return true;
        }

        if (root1 == null || root2 == null) {
            return false;
        }

        if (!root1.getData().equals(root2.getData())) {
            return false;
        }

        return isSymmetrical(root1.getLeft(), root2.getRight()) &&
                isSymmetrical(root1.getRight(), root2.getLeft());
    }
}
