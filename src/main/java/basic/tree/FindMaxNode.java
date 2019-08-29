package basic.tree;

import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019/8/5
 */
public class FindMaxNode {

    public static TreeNode<Integer> max(TreeNode<Integer> treeNode) {
        final TreeNode<Integer>[] result = new TreeNode[]{new TreeNode<>(0)};

        CallBack callBack = t -> {
            Integer a = (Integer) t.getData();
            if (a > result[0].getData()) {
                result[0] = t;
            }
            return null;
        };

        NonRecursivePreorderTraversal.traversal(treeNode, callBack);
        return result[0];
    }
}
