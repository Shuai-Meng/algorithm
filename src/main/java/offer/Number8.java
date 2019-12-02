package offer;

import basic.TreeNode;

/**
 * @Author mengshuai
 * @Date 2019/12/2
 */
public class Number8 {
    public static TreeNode findNextInOrder(TreeNode node) {
        if (node == null) {
            return null;
        }

        if (node.getRight() != null) {
            TreeNode tmp = node.getRight();
            while (tmp.getLeft() != null) {
                tmp = tmp.getLeft();
            }
            return tmp;
        } else {
            TreeNode parent = node.getParent();
            TreeNode cur = node;

            while (parent != null && parent.getLeft() != cur) {
                cur = parent;
                parent = parent.getParent();
            }
            return parent;
        }
    }
}
