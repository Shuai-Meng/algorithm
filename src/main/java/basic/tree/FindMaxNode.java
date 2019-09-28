package basic.tree;

import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019/8/5
 */
public class FindMaxNode {

    public static TreeNode<Comparable> max(TreeNode<Comparable> treeNode) {
        final TreeNode<Comparable>[] result = new TreeNode[1];

        CallBack<TreeNode<Comparable>> callBack = t -> {
            if (t == null || result[0] == null) {
                result[0] = t;
            } else if (t.getData().compareTo(result[0].getData()) > 0) {
                result[0] = t;
            }
            return null;
        };

        NonRecursivePreorderTraversal.traversal(treeNode, callBack);
        return result[0];
    }
}
