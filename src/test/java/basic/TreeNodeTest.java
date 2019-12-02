package basic;

import basic.tree.FindMaxNode;
import basic.util.CallBack;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @Author mengshuai
 * @Date 2019/8/4
 */
public class TreeNodeTest {

    int[] arr = {13,22,33,84,25,63,57,48,91};
    private TreeNode<Comparable> root1, root2;

    @BeforeClass
    public void create() {
        TreeNode[] tree = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tree[i] = new TreeNode(arr[i]);
        }

        root1 = TreeNode.createTree(tree);
        root2 = TreeNode.createTree(tree);
    }

    @Test
    public void testTraversal() {
        CallBack<TreeNode> callBack = t -> {
            System.out.println(t.getData());
            return null;
        };

        root1.nonRecursivePreorderTraversal(callBack);
    }

    @Test
    public void testEquals() {
        TreeNode treeNode1 = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(0);

        Assert.assertFalse(treeNode1.equals(null));
        Assert.assertFalse(treeNode1.equals(5));
        Assert.assertFalse(treeNode1.equals(treeNode2));
        Assert.assertTrue(treeNode1.equals(treeNode1));
        Assert.assertTrue(treeNode1.equals(treeNode3));

        treeNode3.setRight(treeNode2);
        Assert.assertTrue(treeNode1.equals(treeNode3));
    }

    @Test
    public void testTreeEquals() {
        Assert.assertTrue(TreeNode.treeEquals(root1, root2));
    }

    @Test
    public void testFindMaxNode() {
        Assert.assertEquals(91, (int) FindMaxNode.max(root1).getData());
    }
}
