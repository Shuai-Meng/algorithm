package offer;

import basic.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: mengshuai
 * @Date: 2019.12.03 11:45
 */
public class Number54 {

    public static TreeNode<Integer> findMaxK(final TreeNode<Integer> root, int k) {
        if (root == null || k < 1) {
            return null;
        }

        List<TreeNode> list = new ArrayList();
        inorder(root, list);
        if (k > list.size()) {
            return null;
        }
        return list.get(k - 1);
    }

    private static void inorder(TreeNode<Integer> root, List<TreeNode> list) {
        if (root == null) {
            return;
        }

        inorder(root.getLeft(), list);
        list.add(root);
        inorder(root.getRight(), list);
    }
}
