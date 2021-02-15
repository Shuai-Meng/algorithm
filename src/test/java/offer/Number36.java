package offer;

import org.junit.Test;

/**
 * @Author: mengshuai
 * @Date: 2020.4.05 19:07
 */
public class Number36Test {

    @Test
    public void test() {
		int[] num = new int[]{9,8,7,6,5,10,11,4,3,12,13};
		TreeNode[] tree = new TreeNode[num.length]
		for (int i = 0; i < num.length; i++) {
			tree[i] = new TreeNode(num[i]);
		}
		TreeNode root = TreeNode.createTree(tree);

		TreeNode[] list = new TreeNode[2];
		Number36.transferToList(root, list);
		if (list[0].getData() != 3 && list[1].getData() != 13) {
			System.out.println("wrong answer");
		}
    }
}
