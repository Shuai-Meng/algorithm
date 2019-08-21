package basic.tree;

import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019.08.04
 */
public class PreorderTraversal {

    public static <T> void traversal(TreeNode<T> treeNode, CallBack<T> callBack) {
        if (treeNode != null) {
            callBack.call(treeNode.getData());
            traversal(treeNode.getLeft(), callBack);
            traversal(treeNode.getRight(), callBack);
        }
    }
}
