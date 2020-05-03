package com.dataStructure.linkedList.problems;

public class AddTwoNumbersInLinkedList {
	private static Node addNumbers(Node head1, Node head2) {
		int number = 0;
		int counter = 0;
		Node temp;
		for(temp=head1; temp!=null; temp=temp.next) {
			number += temp.data*(Math.pow(10, counter));
			counter++;
		}

		counter = 0;
		for(temp=head2; temp!=null; temp=temp.next) {
			number += temp.data*(Math.pow(10, counter));
			counter++;
		}

		Node head = null;
		while(number != 0) {
			if(head == null)
				head = Node.createNode(number%10);
			else {
				for(temp=head; temp.next!=null; temp=temp.next);
				temp.next = Node.createNode(number%10);
			}
			number = number / 10;
		}

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList
				.insertData(5)
				.insertData(6)
				.insertData(3)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList
				.insertData(8)
				.insertData(4)
				.insertData(2)
				.getHead();
		System.out.println(linkedList);

		Node head = addNumbers(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}