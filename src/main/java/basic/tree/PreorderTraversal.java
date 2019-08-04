package basic.tree;

/**
 * @Author mengshuai
 * @Date 2019.08.04
 */
public class PreorderTraversal {

    public static <T> void traversal(TreeNode<T> treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.getData());
            traversal(treeNode.getLeft());
            traversal(treeNode.getRight());
        }
    }
}
