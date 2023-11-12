package LinkedListAssignment;

public class InsertNodeAtN {

	Node1 head;
	class Node1{
		int data;
		Node1 next;
		Node1(int d){
			data = d;
			next = null;
		}
	}

	public void insertNode(int n,int val) {
		Node1 newNode = new Node1(val);
		if(n == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}
		Node1 tempNode = head;
		for (int i = 1; i < n; i++) {
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	
	public void push(int data) {
		Node1 newNode = new Node1(data);
		newNode.next = head;
		head = newNode;
	}
	public void printLL() {
		Node1 temp =head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int n = 2;
		int val = 3;
		InsertNodeAtN list = new InsertNodeAtN();
		list.push(6);
		list.push(5);
		list.push(4);
		list.push(2);
		list.push(1);
		System.out.println("linked list ");
		list.printLL();
		System.out.println("After adding value in linked list");
		list.insertNode(n, val);
		list.printLL();
	}
}
