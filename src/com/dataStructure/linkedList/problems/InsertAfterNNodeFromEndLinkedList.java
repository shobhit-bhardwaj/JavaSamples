package com.dataStructure.linkedList.problems;

public class InsertAfterNNodeFromEndLinkedList {

	/*
	 * Approach 1 - Find the length and then traverse the list from length - position.
	 * It will take two traverse but one space.
	 * 
	 */
	private static Node insertAfterNNodeFromEndByLength(Node head, int data, int position) {
		int length = 0;
		for(Node temp=head; temp!=null; temp=temp.next)
			length++;

		position = length - position;

		Node node = Node.createNode(data);

		Node temp = head;
		for(int i=0; i<position-1; i++)
			temp = temp.next;

		node.next = temp.next;
		temp.next = node;

		return head;
	}

	/*
	 * Approach 2 - It will take two pointers but only one traverse.
	 * 
	 */
	private static Node insertAfterNNodeFromEndByTwoPointers(Node head, int data, int position) {
		Node fast = head;
		for(int i=0; i<position; i++)
			fast = fast.next;

		Node slow = head;
		while(fast.next != null) {
			fast = fast.next;
			slow = slow.next;
		}

		Node node = Node.createNode(data);

		node.next = slow.next;
		slow.next = node;

		return head;
	}

	public static void main(String[] args) {
		Node head = new SinglyLinkedList()
				.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.insertData(80)
				.insertData(90)
				.insertData(100)
				.getHead();
		SinglyLinkedList.traverse(head);

		head = insertAfterNNodeFromEndByLength(head, 75, 3);
		//head = insertAfterNNodeFromEndByTwoPointers(head, 75, 3);
		SinglyLinkedList.traverse(head);
	}
}