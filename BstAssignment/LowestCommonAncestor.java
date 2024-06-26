package BstAssignment;

import java.util.LinkedList;
import java.util.Queue;

import BstAssignment.*;

public class LowestCommonAncestor {

	public static TreeNode insert(TreeNode root,int key) {
		if (root == null) {
			return new TreeNode(key);
		}
		if (key < root.val) {
			root.left = insert(root.left, key);
		}
		else {
			root.right = insert(root.right, key);
		}
		return root;
	}
	
	public static Integer getLowestCommonAncestor(TreeNode root,int key1,int key2) {
		if (root.val == key1 || root.val == key2) {
			return root.val;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		Integer leftN = getLowestCommonAncestor(root.left, key1, key2);
		Integer rightN = getLowestCommonAncestor(root.right, key1, key2);
		if (leftN != null && rightN !=null) {
			return root.val;
		}
		if(leftN != null) return leftN;
		else return rightN;
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		insert(root, 10);
		insert(root, 28);
		insert(root, 8);
		insert(root, 12);
		insert(root, 20);
		insert(root, 30);
		insert(root, 6);
		insert(root, 9);
		insert(root, 18);
		insert(root, 22);
		
		Integer ans = getLowestCommonAncestor(root,6, 12);
		System.out.println(ans);
		Integer ans2 = getLowestCommonAncestor(root,10, 12);
		System.out.println(ans2);
		Integer ans3= getLowestCommonAncestor(root,20, 6);
		System.out.println(ans3);
		Integer ans4 = getLowestCommonAncestor(root,18, 22);
		System.out.println(ans4);
		Integer ans5 = getLowestCommonAncestor(root,30, 30);
		System.out.println(ans5);
	}
}
