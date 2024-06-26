package BstAssignment;

public class InorderPredecessor {

	public static int getMaxLeft(TreeNode root) {
		while(root.right!=null) {
			root = root.right;
		}
		return root.val;
	}
	
	public static void getPredecessor(TreeNode root,TreeNode predecossor,int key) {
		if (root == null) {
			return;
		}
		getPredecessor(root.left,predecossor,key);
		
		if (root.val == key) {
			if (root.left!=null) {
				System.out.println("The predecessor of node "+key+" is "+getMaxLeft(root.left));
			}
			else if (predecossor != null) {
				System.out.println("The predecessor of node "+key+" is "+predecossor.val);
			}else {
				System.out.println("The predecessor doesn’t exist for node "+key);
			}
		}
		predecossor = root;
		getPredecessor(root.right, predecossor, key);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(20);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(16);
		root.right.right = new TreeNode(25);
		
		getPredecessor(root,null,15);
		getPredecessor(root,null,10);
		getPredecessor(root,null,20);
		getPredecessor(root,null,8);
		getPredecessor(root,null,12);
		getPredecessor(root,null,16);
		getPredecessor(root,null,25);
	}
}
