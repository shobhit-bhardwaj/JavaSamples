package com.dataStructure.linkedList.problems;

public class AddTwoNumbersInLinkedList {
	private static Node addNumbers(Node head1, Node head2) {
		int counter = 0;
		int power = 0;
		for(Node temp=head1; temp!=null; temp=temp.next) {
			counter += temp.data*(Math.pow(10, power));
			power++;
		}

		power = 0;
		for(Node temp=head2; temp!=null; temp=temp.next) {
			counter += temp.data*(Math.pow(10, power));
			power++;
		}

		int data = -1;
		SinglyLinkedList result = new SinglyLinkedList();
		while(counter != 0) {
			data = counter % 10;
			counter = counter/10;
			result.insertData(data);
		}

		return result.getHead();
	}

	public static void main(String[] args) {
		Node head1 = new SinglyLinkedList()
				.insertData(5)
				.insertData(6)
				.insertData(3)
				.getHead();
		SinglyLinkedList.traverse(head1);

		Node head2 = new SinglyLinkedList()
				.insertData(8)
				.insertData(4)
				.insertData(2)
				.getHead();
		SinglyLinkedList.traverse(head2);

		Node head = addNumbers(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}