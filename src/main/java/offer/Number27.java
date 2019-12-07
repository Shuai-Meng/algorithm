package offer;

import basic.TreeNode;

/**
 * @Author mengshuai
 * @Date 2019/12/6
 */
public class Number27 {
    public void getMirror(final TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tmp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(tmp);

        getMirror(root.getLeft());
        getMirror(root.getRight());
    }
}
