package com.dataStructure.linkedList.problems;

public class LengthOfLinkedList {
	private static int length(Node head) {
		//	Using for loop
		int length = 0;
		for(Node temp=head; temp!=null; temp=temp.next)
			length++;

		//	Using while loop
		length = 0;
		Node node = head;
		while(node != null) {
			node = node.next;
			length++;
		}

		return length;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		SinglyLinkedList.traverse(head);

		int length = length(head);
		System.out.println("Length of List - " + length);
	}
}