package BstAssignment;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int data) {
		val = data;
		left = null;
		right = null;
	}
}

public class SearchInBst {
	
	public static void searchElement(TreeNode root,int key) {
		TreeNode parent = null;
		TreeNode curr = root;
		while(curr != null) {
			if (key == curr.val) {
				if(parent.left == curr) {
					System.out.println("the given key is the left node with key " + parent.val);
					break;
				}else {
					System.out.println("the given key is the right node with key " + parent.val);
					break;
				}
			}
			else if (key < curr.val) {
				parent = curr;
				curr = curr.left;
			}else {
				parent = curr;
				curr = curr.right;
			}
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.right = new TreeNode(25);
		
		searchElement(root,25);
	}
}
