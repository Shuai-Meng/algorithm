package basic.tree;

import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019.08.04
 */
public class PreorderTraversal {

    public static <T> void traversal(TreeNode<T> treeNode, CallBack callBack) {
        if (treeNode != null && callBack != null) {
            callBack.call(treeNode);
            traversal(treeNode.getLeft(), callBack);
            traversal(treeNode.getRight(), callBack);
        }
    }
}
