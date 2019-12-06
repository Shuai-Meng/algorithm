package leetcode;

import basic.TreeNode;
import leetcode.medium.Number662;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: mengshuai
 * @Date: 2019.12.06 20:07
 */
public class Number662Test {

    private TreeNode<Integer> root;

    @Test
    public void test() {
        Assert.assertEquals(0, Number662.findMaxWidth(root));
        Assert.assertEquals(1, Number662.findMaxWidth(new TreeNode(1)));
    }

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.setLeft(new TreeNode(3));
        root.getLeft().setLeft(new TreeNode(5));
        root.getLeft().setRight(new TreeNode(3));
        Assert.assertEquals(2, Number662.findMaxWidth(root));

        root.setRight(new TreeNode(2));
        root.getLeft().setRight(null);
        Assert.assertEquals(2, Number662.findMaxWidth(root));

        root.getRight().setRight(new TreeNode(9));
        Assert.assertEquals(4, Number662.findMaxWidth(root));

        root.getLeft().getLeft().setLeft(new TreeNode(6));
        root.getRight().getRight().setRight(new TreeNode(7));
        Assert.assertEquals(8, Number662.findMaxWidth(root));
    }
}
