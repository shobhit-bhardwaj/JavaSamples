package com.dataStructure.linkedList.problems;

public class MergeTwoSortedLinkedList {
	private static Node mergeList(Node node1, Node node2) {
		Node head = Node.createNode(0);
		Node result = head;

		while(node1 != null && node2 != null) {
			if(node1.data < node2.data) {
				result.next = node1;
				node1 = node1.next;
			} else {
				result.next = node2;
				node2 = node2.next;
			}
			result = result.next;
		}

		if(node1 != null)
			result.next = node1;
		if(node2 != null)
			result.next = node2;

		return head.next;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head1 = linkedList.insertData(10)
				.insertData(30)
				.insertData(40)
				.insertData(70)
				.insertData(80)
				.getHead();
		System.out.println(linkedList);

		linkedList = new SinglyLinkedList();
		Node head2 = linkedList.insertData(20)
				.insertData(50)
				.insertData(60)
				.insertData(100)
				.getHead();
		System.out.println(linkedList);

		Node head = mergeList(head1, head2);
		SinglyLinkedList.traverse(head);
	}
}