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

    public static void preorderTraversal(TreeNode treeNode, CallBack callBack) {
        if (callBack == null) {
            return;
        }

        if (treeNode != null) {
            callBack.call(treeNode.data);
            preorderTraversal(treeNode.left, callBack);
            preorderTraversal(treeNode.right, callBack);
        }
    }

    public void nonRecursivePreorderTraversal(CallBack callBack) {
        if (callBack == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode<T> root = this;

        while (true) {
            while (root != null) {
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

    /**
     * compared as node, only member data considered
     * @param tTreeNode node to be compared
     * @return whether two nodes' data equals
     */
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

    /**
     * compare two trees
     * @param p param to be compared which treated as root
     * @param q param to be compared which treated as root
     * @return true if each node of two trees in correspond position equals
     */
    public static boolean treeEquals(TreeNode p, TreeNode q) {

        if (p != null && q != null) {
            if (!p.equals(q)) {
                return false;
            }

            if (!treeEquals(p.left, q.left)) {
                return false;
            }
            if (!treeEquals(p.right, q.right)) {
                return false;
            }
        }

        if (p == null && q == null) {
            return true;
        }

        return false;
    }
}
