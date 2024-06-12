package TreeAssignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderFromBottom {

	public static void levOrderBottom(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		Stack<Integer> s = new Stack<>();
		
		q.add(root);
		while(!q.isEmpty()) {
			TreeNode node = q.remove();
			s.push(node.val);
			if(node.right!=null) q.add(node.right);
			if (node.left!=null) q.add(node.left);
		}
		while(!s.isEmpty()) {
			System.out.print(s.pop()+" ");
		}
		
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		levOrderBottom(root);
	}
}
