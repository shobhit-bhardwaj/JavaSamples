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