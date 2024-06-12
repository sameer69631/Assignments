package TreeAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class IsCompleteBinaryTree {

	public static boolean isCompleteBinary(TreeNode root) {
		if (root == null) {
			return true;
		}
		
		boolean flag = false;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		TreeNode node;
		while(!q.isEmpty()) {
			node = q.remove();
			if (flag && (node.left!=null || node.right!=null)) {
				return false;
			}
			if (node.left==null && node.right!=null) {
				return false;
			}
			
			if (node.left != null) {
				q.add(node.left);
			}else  flag = true;
			if (node.right!=null) {
				q.add(node.right);
			}else {
				flag = true;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		System.out.println("is given tree a complete binary : "+ isCompleteBinary(root));
	}
}
