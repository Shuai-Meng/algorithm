package offer;

import basic.Queue;
import basic.Stack;
import basic.TreeNode;


/**
 * @Author mengshuai
 * @Date 2019/12/1
 */
public class Number32 {
    public static void printFromTopToButtom(final TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new Queue();
        queue.enqueue(root);
        while (queue.getSize() != 0) {
            TreeNode tmp = queue.dequeue();
            System.out.print(tmp.getData() + " ");
            if (tmp.getLeft() != null) {
                queue.enqueue(tmp.getLeft());
            }
            if (tmp.getRight() != null) {
                queue.enqueue(tmp.getRight());
            }
        }
    }

    public static void printWithLineFeed(final TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new Queue<>();
        queue.enqueue(root);
        int cur = 1;
        int next = 0;

        while (queue.getSize() != 0) {
            TreeNode tmp = queue.dequeue();
            System.out.print(tmp.getData() + " ");

            if (tmp.getLeft() != null) {
                queue.enqueue(tmp.getLeft());
                next++;
            }
            if (tmp.getRight() != null) {
                queue.enqueue(tmp.getRight());
                next++;
            }

            cur--;
            if (0 == cur) {
                System.out.println();
                cur = next;
                next = 0;
            }
        }
    }


    public static void printLikeSnake(final TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        stack1.push(root);
        boolean flag = true;

        while (stack1.getSize() != 0 || stack2.getSize() != 0) {
            if (flag) {
                printStack(stack1, stack2, flag);
                flag = false;
            } else {
                printStack(stack2, stack1, flag);
                flag = true;
            }
        }
    }

    private static void printStack(Stack<TreeNode> cur, Stack<TreeNode> next, boolean flag) {
        while (cur.getSize() != 0) {
            TreeNode tmp = cur.pop();
            System.out.print(tmp.getData() + " ");
            if (flag) {
                if (tmp.getLeft() != null) {
                    next.push(tmp.getLeft());
                }
                if (tmp.getRight() != null) {
                    next.push(tmp.getRight());
                }
            } else {
                if (tmp.getRight() != null) {
                    next.push(tmp.getRight());
                }
                if (tmp.getLeft() != null) {
                    next.push(tmp.getLeft());
                }
            }
        }
        System.out.println();
    }
}
