package com.dataStructure.linkedList.problems;

public class NthNodeInLinkedList {
	private static Node nthNode(Node head, int n) {
		Node node = head;
		for(int i=0; i<n-1; i++)
			node = node.next;

		return node;
	}

	private static Node nthNodeFromLast(Node head, int n) {
		Node fast = head;
		for(int i=0; i<n-1; i++)
			fast = fast.next;

		Node slow = head;
		for(Node temp=fast; temp.next!=null; temp=temp.next) {
			fast = fast.next;
			slow = slow.next;
		}

		return slow;
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

		Node node = nthNode(head, 3);
		System.out.println("Nth Node - " + node.data);

		node = nthNodeFromLast(head, 4);
		System.out.println("Nth Node From Last - " + node.data);
	}
}