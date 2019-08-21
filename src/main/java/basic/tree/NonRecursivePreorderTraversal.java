package basic.tree;

import basic.stack.Stack;
import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class NonRecursivePreorderTraversal {

    public static <T> void traversal(TreeNode<T> treeNode, CallBack<T> callBack) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode<T> root = treeNode;

        while (true) {
            while (root != null) {
                callBack.call(root.getData(), null);
                stack.push(root);
                root = root.getLeft();
            }

            if (stack.getSize() == 0) {
                break;
            }

            root = stack.pop().getRight();
        }
    }
}
