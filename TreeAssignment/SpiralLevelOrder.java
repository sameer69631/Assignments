package TreeAssignment;

class TreeNode{
	int val;
	TreeNode left = null;
	TreeNode right = null;
	public TreeNode(int val) {
		this.val = val;
	}
}

public class SpiralLevelOrder {

	public static boolean leftToRight(TreeNode root,int level) {
		if (root == null) {
			return false;
		}
		if (level == 1) {
			System.out.print(root.val+" ");
			return true;
		}
		boolean left = leftToRight(root.left, level - 1);
		boolean right = leftToRight(root.right, level - 1);
		return left || right;
	}
	
	public static boolean rightToLeft(TreeNode root,int level) {
		if (root == null) {
			return false;
		}
		if (level == 1) {
			System.out.print(root.val+" ");
			return true;
		}
		boolean right = rightToLeft(root.right, level - 1);
		boolean left = rightToLeft(root.left, level - 1);
		return right || left;
	}
	
	public static void printSpiralLevel(TreeNode root) {
		if (root == null) {
			return;
		}
		int level = 1;
		while(leftToRight(root, level++)&&rightToLeft(root, level++));
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.left.left = new TreeNode(8);
		root.right.left.right = new TreeNode(9);
		
		printSpiralLevel(root);
	}
}
