package offer;

import basic.TreeNode;

import java.util.Arrays;

/**
 * @Author mengshuai
 * @Date 2019/11/29
 */
public class Number7 {
    public static TreeNode construct(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null || preorder.length == 0
                || inorder.length == 0) {
            return null;
        }

        int val = preorder[0];
        TreeNode root = new TreeNode(val);

        int i = 0;
        for (; i < inorder.length; i++) {
            if (inorder[i] == val) {
                break;
            }
        }

        if (i == inorder.length) {
            return null;
        }

        if (i >= 0) {
            int[] leftTreePreorder = Arrays.copyOfRange(preorder, 1, i + 1);
            int[] leftTreeInorder = Arrays.copyOfRange(inorder, 0, i);
            TreeNode left = construct(leftTreePreorder, leftTreeInorder);
            root.setLeft(left);
        }

        if (i < inorder.length) {
            int[] rightTreePreorder = Arrays.copyOfRange(preorder, i + 2, preorder.length);
            int[] rightTreeInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
            TreeNode right = construct(rightTreePreorder, rightTreeInorder);
            root.setRight(right);
        }

        return root;
    }
}
