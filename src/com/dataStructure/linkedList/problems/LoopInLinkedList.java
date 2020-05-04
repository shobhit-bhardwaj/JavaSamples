package com.dataStructure.linkedList.problems;

public class LoopInLinkedList {
	private static Node createLoopInLinkedList(Node head) {
		Node node = head;
		Node middle = head;
		while(node.next != null) {
			if(node.data == 40) {
				middle = node;
			}

			node= node.next;
		}
		node.next = middle;

		return head;
	}

	private static boolean floydCycleAlgorithm(Node head) {
		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast)
				return true;
		}

		return false;
	}

	private static int lengthOfLoopInLinkedList(Node head) {
		boolean loopFound = false;

		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast) {
				loopFound = true;
				break;
			}
		}

		int length = 0;
		if(loopFound) {
			fast = fast.next;

			while(slow != fast) {
				if(slow == fast)
					return length;

				fast = fast.next;
				length++;
			}
		}

		return length;
	}

	private static Node removeLoopInLinkedList(Node head) {
		boolean loopFound = false;

		Node slow = head;
		Node fast = head;
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast) {
				loopFound = true;
				break;
			}
		}

		if(loopFound) {
			slow = head;
			while(fast.next != slow.next) {
				slow = slow.next;
				fast = fast.next;
			}

			fast.next = null;
		}

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
				.insertData(80)
				.insertData(90)
				.getHead();
		System.out.println(linkedList);

		head = createLoopInLinkedList(head);

		boolean loop = floydCycleAlgorithm(head);
		System.out.println("Loop Found - " + loop);

		int length = lengthOfLoopInLinkedList(head);
		System.out.println("Length of Loop - " + length);

		head = removeLoopInLinkedList(head);
		SinglyLinkedList.traverse(head);
	}
}