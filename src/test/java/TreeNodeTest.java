import basic.tree.TreeNode;
import basic.tree.NonRecursivePreorderTraversal;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class TreeNodeTest {
    private TreeNode<Integer> root;

    @Before
    public void create() {
        int[] arr = {13,22,33,84,25,63,57,48,91};
        TreeNode[] tree = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tree[i] = new TreeNode(arr[i]);
        }

        root = TreeNode.createTree(tree);
    }

    @Test
    @Ignore
    public void testTraversal() {
        NonRecursivePreorderTraversal.traversal(root, null);
    }
}
