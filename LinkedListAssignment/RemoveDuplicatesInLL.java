package LinkedListAssignment;

import LinkedListAssignment.InsertNodeAtN.Node1;

public class RemoveDuplicatesInLL {

	Node2 head;
	class Node2{
		int data;
		Node2 next;
		Node2(int d){
			data = d;
			next = null;
		}
	}

	public void removeDuplicates() {
		Node2 prevNode = head;
		Node2 currentNode = head.next;
		while(currentNode != null) {
			if (prevNode.data == currentNode.data) {
				prevNode.next = currentNode.next;
				currentNode = prevNode.next;
				continue;
			}
			prevNode = prevNode.next;
			currentNode = currentNode.next;
		}
	}
	
	public void push(int data) {
		Node2 newNode = new Node2(data);
		newNode.next = head;
		head = newNode;
	}
	public void printLL() {
		Node2 temp =head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesInLL list = new RemoveDuplicatesInLL();
		list.push(3);
		list.push(3);
		list.push(2);
		list.push(1);
		list.push(1);
		System.out.println("linked list ");
		list.printLL();
		System.out.println("After removing duplicates in linked list");
		list.removeDuplicates();
		list.printLL();
	}
}
