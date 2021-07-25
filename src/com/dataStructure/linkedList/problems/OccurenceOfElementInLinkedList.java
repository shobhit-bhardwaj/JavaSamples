package com.dataStructure.linkedList.problems;

public class OccurenceOfElementInLinkedList {
	private static int occurenceOfElement(Node head, int key) {
		int occurence = 0;

		//	Using for loop
		for(Node temp=head; temp!=null; temp=temp.next)
			if(temp.data == key)
				occurence++;

		//	Using while loop
		occurence = 0;

		Node node = head;
		while(node != null) {
			if(node.data == key)
				occurence++;

			node = node.next;
		}

		return occurence;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(20)
				.insertData(50)
				.insertData(20)
				.insertData(60)
				.insertData(20)
				.getHead();
		SinglyLinkedList.traverse(head);

		int occurence = occurenceOfElement(head, 20);
		System.out.println("Occurence - " + occurence);
	}
}