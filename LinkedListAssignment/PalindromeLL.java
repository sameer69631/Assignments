package LinkedListAssignment;

import LinkedListAssignment.ChekXInList.*;
//CheckXInList is a class in this package which has Node class
public class PalindromeLL {

	public Node reverseLL(Node node) {
		Node curr = node, prev = null, nextNode = null;
		while(curr != null) {
			nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}
	
	public Node middleNodeLL(Node headNode) {
		Node slowNode=headNode , fastNode=headNode;
		while(fastNode != null && fastNode.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		return slowNode;
	}
	//checking list is a palindrome
	public boolean isPalindromeLL(Node headNode) {
		Node middleNode = middleNodeLL(headNode);
		Node lastNode = reverseLL(middleNode.next);
		Node current = headNode;
		while(lastNode != null) {
			if (current.data != lastNode.data) {
				return false;
			}
			current = current.next;
			lastNode = lastNode.next;
		}
		reverseLL(middleNode.next);
		return true;
	}
	
	public static void main(String[] args) {
		ChekXInList list = new ChekXInList();
		PalindromeLL palindrome = new PalindromeLL();
		list.push(1);
		list.push(2);
		list.push(2);
		list.push(1);
		System.out.println(palindrome.isPalindromeLL(list.head));
	}
}
