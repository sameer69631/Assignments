package TreeAssignment;

import java.util.ArrayList;

public class LeftView {

	public static void getLeftView(TreeNode root,ArrayList<TreeNode> aList,int level) {
		if(root == null) return;
		if (level==aList.size()) {
			aList.add(root);
		}
		getLeftView(root.left, aList, level+1);
		getLeftView(root.right, aList, level+1);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		ArrayList<TreeNode> al = new ArrayList<>();
		getLeftView(root,al,0);
		for(TreeNode curr : al) {
			System.out.print(curr.val+" ");
		}
	}
}
