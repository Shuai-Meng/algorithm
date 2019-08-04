package basic.tree;

import basic.stack.Stack;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class NonRecursivePreorderTraversal {

    public static <T> void traversal(TreeNode<T> treeNode) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode<T> root = treeNode;

        while (true) {
            while (root != null) {
                System.out.println(root.getData());
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
