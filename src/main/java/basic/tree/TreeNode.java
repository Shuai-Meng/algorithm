package basic.tree;

import basic.stack.Stack;
import basic.util.CallBack;

/**
 * @Author mengshuai
 * @Date 2019.08.04
 */
public class TreeNode<T> {
    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T t) {
        this(t, null, null);
    }

    public TreeNode(T t, TreeNode left, TreeNode right) {
        this.data = t;
        this.left = left;
        this.right = right;
    }

    public static TreeNode createTree(TreeNode[] tree) {
        for (int i = 0; i < tree.length; i++) {
            if (2 * i <= tree.length - 2) {
                tree[i].setLeft(tree[i * 2 + 1]);
            }
            if (2 * i <= tree.length - 3) {
                tree[i].setRight(tree[i * 2 + 2]);
            }
        }
        return tree[0];
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public void preorderTraversal(CallBack callBack) {
        if (callBack == null) {
            return;
        }

        TreeNode treeNode = this;

        if (treeNode != null) {
            callBack.call(treeNode);
            preorderTraversal(callBack);
            preorderTraversal(callBack);
        }
    }

    public void nonRecursivePreorderTraversal(CallBack callBack) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode<T> root = this;

        while (true) {
            while (root != null && callBack != null) {
                callBack.call(root);
                stack.push(root);
                root = root.getLeft();
            }

            if (stack.getSize() == 0) {
                break;
            }

            root = stack.pop().getRight();
        }
    }

    @Override
    public boolean equals(Object tTreeNode) {
        if (tTreeNode == null) {
            return this == null;
        }

        if (!(tTreeNode instanceof TreeNode)) {
            return false;
        }

        Object data = ((TreeNode)tTreeNode).data;
        if (data == null) {
            return this.data == null;
        }

        return data.equals(this.data);
    }

    public boolean treeEquals(TreeNode treeNode) {
        return false;
    }
}
