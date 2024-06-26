package BstAssignment;

import java.util.ArrayList;

public class GivenSumPair {
	
	static class Pair {
		int val1=-1;
		int val2=-1;
	}
	
	public static void inOrder(TreeNode root,ArrayList<Integer> arr){
		if(root == null) {
			return;
		}
		inOrder(root.left,arr);
		arr.add(root.val);
		inOrder(root.right,arr);
	}
	
	public static Pair findSumPair(TreeNode root,int sum) {
		ArrayList<Integer> al = new ArrayList<>();
		inOrder(root, al);
		Pair pair = new Pair();
		int i=0,j=al.size()-1;
		while(i<j) {
			if((al.get(i)+al.get(j))==sum) {
				pair.val1 = al.get(i);
				pair.val2 = al.get(j);
				break;
			}
			else if ((al.get(i)+al.get(j)) < sum) i+=1;
			else j-=1;
		}
		return pair;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(15);
		root.left = new TreeNode(10);
		root.right = new TreeNode(28);
		root.left.left = new TreeNode(8);
		root.left.right = new TreeNode(12);
		root.right.left = new TreeNode(20);
		root.right.right = new TreeNode(30);
		root.left.left.left = new TreeNode(6);
		root.left.left.right = new TreeNode(9);
		root.right.left.left = new TreeNode(18);
		root.right.left.right = new TreeNode(22);
		
		int sum = 14;
		Pair pair = findSumPair(root, sum);
		System.out.println("pair is : "+"(" + pair.val1 +","+ pair.val2 +")");
	}
}
