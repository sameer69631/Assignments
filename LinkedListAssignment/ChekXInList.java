package LinkedListAssignment;

import LinkedListAssignment.InsertNodeAtN.Node1;

public class ChekXInList {

	Node head;
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void push(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = new Node(newData);
			return;
		}
		newNode.next = null;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	
	public boolean searchLL(Node head , int x) {
		Node current = head;
		while(current != null) {
			if(current.data == x) return true;
			current = current.next;
		}
		return false;
	}
	public void printLL() {
		Node temp =head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ChekXInList list = new ChekXInList();
		list.push(14);
		list.push(21);
		list.push(11);
		list.push(30);
		list.push(10);
		int x = 14;
		if(list.searchLL(list.head, x)) System.out.println("yes");
		else System.out.println("no");
	}
}
