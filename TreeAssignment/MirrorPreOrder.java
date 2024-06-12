package TreeAssignment;

public class MirrorPreOrder {

	public static void mirrorTree(TreeNode root) {
		if(root == null) return;
		mirrorTree(root.left);
		mirrorTree(root.right);
		TreeNode tempNode = root.left;
		root.left = root.right;
		root.right = tempNode;
	}
	
	public static void printPreOrder(TreeNode root) {
		if (root==null) {
			return;
		}
		System.out.print(root.val+" ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		mirrorTree(root);
		printPreOrder(root);
	}
}
