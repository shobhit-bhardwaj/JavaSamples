package com.dataStructure.linkedList.problems;

public class NthNodeInLinkedList {
	private static Node nthNode(Node node, int n) {
		Node temp;
		int counter = 1;
		for(temp=node; temp.next!=null; temp=temp.next) {
			if(counter == n)
				return temp;
			counter++;
		}

		return null;
	}

	private static Node nthNodeFromLast(Node node, int n) {
		Node temp1;
		int counter = 1;
		for(temp1=node; temp1.next!=null; temp1=temp1.next) {
			if(counter == n)
				break;
			counter++;
		}

		Node temp2 = node;
		while(temp1.next!=null) {
			temp1 = temp1.next;
			temp2 = temp2.next;
		}

		return temp2;
	}

	public static void main(String[] args) {
		SinglyLinkedList linkedList = new SinglyLinkedList();
		Node head = linkedList.insertData(10)
				.insertData(20)
				.insertData(30)
				.insertData(40)
				.insertData(50)
				.getHead();
		System.out.println(linkedList);

		Node node = nthNode(head, 3);
		System.out.println("Nth Node - " + node.data);

		node = nthNodeFromLast(head, 4);
		System.out.println("Nth Node From Last - " + node.data);
	}
}