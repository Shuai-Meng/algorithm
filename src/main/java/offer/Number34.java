package offer;

/**
 * @Author: mengshuai
 * @Date: 2019.12.03 11:47
 */
public class Number34 {
    public void printPath(TreeNode root, int target) {
        Stack stack = new Stack();
        Stack path = new Stack();
        int total = 0;

        while(true) {
            while (root != null) {
                path.push(root);
                total += root.getData();
                stack.push(root);
                root = root.getLeft();
            }

            if (stack.getSize() == 0) {
                break;
            }

            root = stack.pop();
            //leaf
            if (root.getLeft() == null && root.getRight() == null) {
                if (total == target) {
                    printStack(path);
                }
                path.pop();
                total -= root.getData();
            }

            root = root.getRight();
        }
    }

    private void printStack(Stack path) {
        Stack tmp = new Stack();
        while (path.getSize() != 0) {
            tmp.push(path.pop());
        }
        while (tmp.getSize() != 0) {
            TreeNode node = tmp.pop();
            System.out.print(node.getData() + ",");
            path.push(node);
        }
        System.out.print("\n");
    }
}
