package com.dataStructure.linkedList.problems;

public class SwapNodeInLinkedList {
	private static Node swapNodes(Node head, int x, int y) {
		Node prevX = null;
		Node currX = head;
		while(currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		Node prevY = null;
		Node currY = head;
		while(currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		if(prevX != null)
			prevX.next = currY;
		else
			head = currY;

		if(prevY != null)
			prevY.next = currX;
		else
			head = currX;

		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;

		return head;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.insertData(60)
				.insertData(70)
				.getHead();
		System.out.println(linkedList);

		swapNodes(head, 40, 60);
		SinglyLinkedList.traverse(head);
	}
}