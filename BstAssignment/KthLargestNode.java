package BstAssignment;

public class KthLargestNode {
	static int k = 2;
	public static void findKthLargestNode(TreeNode root) {
		if (root == null) {
			return;
		}
		findKthLargestNode(root.right);
		k = k-1;
		if (k == 0) {
			System.out.println(root.val);
		}
		findKthLargestNode(root.left);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.right = new TreeNode(25);
		
		findKthLargestNode(root);
	}
}
