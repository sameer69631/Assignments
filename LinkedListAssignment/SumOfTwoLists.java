package LinkedListAssignment;

public class SumOfTwoLists {
	
	class ListNode{
		int data;
		ListNode next;
		ListNode() {}
		ListNode(int d){
			data = d;
			next = null;
		}
	}
	    ListNode head;
	
	public void addLists(ListNode head1,ListNode head2) {
		SumOfTwoLists list3 = new SumOfTwoLists();
		int carry = 0;
		
		while(head1 != null || head2 != null || carry >= 1) {
			int sum = 0;
			if (head1 != null) {
				sum += head1.data;
				head1 = head1.next;
			}
			if (head2 != null) {
				sum += head2.data;
				head2 = head2.next;
			}
			sum += carry;
			carry = sum/10;
			list3.push(sum%10);
		}
		list3.reverseLinkedList();
		list3.printLL(list3.head);
	}
	
	public void reverseLinkedList() {
		ListNode curr = head;
		ListNode next = null;
		ListNode prev = null;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public void push(int newData) {
		ListNode newNode = new ListNode(newData);
		if (head == null) {
			head = new ListNode(newData);
			return;
		}
		newNode.next = null;
		ListNode temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		return;
	}
	
	public void printLL(ListNode head) {
		ListNode temp =head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		SumOfTwoLists list = new SumOfTwoLists();
		SumOfTwoLists list2 = new SumOfTwoLists();
		SumOfTwoLists add = new SumOfTwoLists();
		list.push(5);
		list.push(6);
		list.push(3);
		
		list2.push(8);
		list2.push(4);
		list2.push(2);
		System.out.print("list 1 :- ");
		list.printLL(list.head);
		System.out.print("list 2 :- ");
		list2.printLL(list2.head);
		System.out.print("sum list :- ");
		list.reverseLinkedList();
		list2.reverseLinkedList();
		add.addLists(list.head, list2.head);
	}
}
