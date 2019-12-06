package leetcode.medium;

import basic.Queue;
import basic.Stack;
import basic.TreeNode;

/**
 * @Author: mengshuai
 * @Date: 2019.12.06 18:15
 */
public class Number662 {
    public static int findMaxWidth(final TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> queue = new Queue();
        Stack<TreeNode> tier = new Stack<>();
        queue.enqueue(root);
        int cur = 1;
        int tierWidth = cur;
        int next = 0;
        int max = 0;

        while (queue.getSize() != 0) {
            TreeNode tmp = queue.dequeue();
            tier.push(tmp);

            int head = 0;
            boolean flag = true;
            if (tmp == null && flag) {
                head++;
            }

            if (tmp != null) {
                flag = false;
                queue.enqueue(tmp.getLeft());
                queue.enqueue(tmp.getRight());
                next = next + 2;
            }


            cur--;
            if (cur == 0) {
                int width = tierWidth - getTail(tier) - head;
                if (width > max) {
                    max = width;
                }

                cur = next;
                tierWidth = cur;
                next = 0;
            }
        }

        return max;
    }

    private static int getTail(Stack<TreeNode> stack) {
        int tail = 0;
        while (stack.getSize() != 0 && stack.pop() == null) {
            tail++;
        }
        return tail;
    }
}
