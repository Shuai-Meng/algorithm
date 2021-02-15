package offer;

/**
 * @Author: mengshuai
 * @Date: 2019.12.03 11:46
 * @Description: BSTree to ordered listnode
 */
public class Number36 {
	public void transferToList(TreeNode root, TreeNode[] result) {
		if (root == null) {
			return;
		}

		if (result.length != 2) {
			return;
		}

		if (root.getLeft() == null) {
			result[0] = root
		} else {
			transferToList(root.getLeft(), result)
			root.setLeft(result[1])
			result[1].setRight(root)
			result[1] = root
		}

		if (root.getRight() == null) {
			result[1] = root
		} else {
			transferToList(root.getRight(), result)
			root.setRight(result[0])
			result[0].setLeft(root)
			result[0] = root
		}
	}
}
