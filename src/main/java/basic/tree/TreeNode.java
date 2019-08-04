package basic.tree;

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
            System.out.println(tree[i].getData());

            if (2 * i <= tree.length - 2) {
                tree[i].setLeft(tree[i * 2 + 1]);
            }
            if (2 * i <= tree.length - 3) {
                tree[i].setRight(tree[i * 2 + 2]);
            }
        }
        return tree[0];
    }

    /*
    public static TreeNode createTree(Object[] arr) {
        TreeNode[] tree= new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tree[i] = new TreeNode(arr[i]);
            if (2 * i <= tree.length - 2) {
                tree[i].setLeft(tree[i * 2 + 1]);
            }
            if (2 * i < tree.length - 3) {
                tree[i].setRight(tree[i * 2 + 2]);
            }
        }

        return tree[0];
    }
    */

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
}
