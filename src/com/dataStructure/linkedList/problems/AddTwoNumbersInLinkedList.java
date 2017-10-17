package com.dataStructure.linkedList.problems;

import com.dataStructure.linkedList.problems.LinkedListDemo.Node;

public class AddTwoNumbersInLinkedList {
	public Node addNumbers(Node head1, Node head2) {
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
				head = new LinkedListDemo().createNode(number%10);
			else {
				for(temp=head; temp.next!=null; temp=temp.next);
				temp.next = new LinkedListDemo().createNode(number%10);
			}
			number = number / 10;
		}

		return head;
	}

	public static void main(String[] args) {
		LinkedListDemo linkedList = new LinkedListDemo();
		linkedList.insertData(5);
		linkedList.insertData(6);
		linkedList.insertData(3);
		Node head1 = linkedList.getHead();

		linkedList = new LinkedListDemo();
		linkedList.insertData(8);
		linkedList.insertData(4);
		linkedList.insertData(2);
		Node head2 = linkedList.getHead();

		AddTwoNumbersInLinkedList add = new AddTwoNumbersInLinkedList();
		Node head = add.addNumbers(head1, head2);
		linkedList.traverse(head);
	}
}