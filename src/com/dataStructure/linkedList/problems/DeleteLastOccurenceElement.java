package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class DeleteLastOccurenceElement {
	public Node delete(Node head, int data) {
		Node temp = head;
		Node node = null;
		while(temp != null) {
			if(data == temp.data)
				node = temp;
			temp = temp.next;
		}

		if(node != null) {
			if(node == head)
				head = head.next;
			else {
				temp = head;
				while(temp.next != node)
					temp = temp.next;
				temp.next = temp.next.next;
			}
		}

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(10);
		linkedList.insertData(20);
		linkedList.insertData(30);
		linkedList.insertData(40);
		linkedList.insertData(50);
		linkedList.insertData(30);
		linkedList.insertData(60);
		linkedList.insertData(70);
		Node head = linkedList.getHead();
		linkedList.traverse(head);

		DeleteLastOccurenceElement deleteElement = new DeleteLastOccurenceElement();
		head = deleteElement.delete(head, 30);
		linkedList.traverse(head);
	}
}