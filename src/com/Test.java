package com;

public class Test {
	class Node {
		int data;
		Node next;
		Node prev;

		public Node() {
		}

		public Node(int data) {
			this.data = data;
		}

		/*@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + ", prev=" + prev + "]";
		}*/
	}

	Node insert(Node head, int data) {
		Node node = new Node(data);

		if(head == null)
			head = node;
		else {
			Node temp = head;
			while(temp.next != null)
				temp = temp.next;
			temp.next = node;
			node.prev = temp;
		}

		return head;
	}

	Node Reverse(Node head) {
		Node curr = head;
		Node prev = null;
		while(curr != null) {
			Node node = curr.next;
			curr.next = prev;
			prev.prev = prev.next;

			curr = node;
		}

		head = prev;
		return head;
	}

	public void test() {
		/*Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(3);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		System.out.println(node);*/

		Node node = insert(null, 1);
		node = insert(node, 2);
		node = insert(node, 3);
		node = insert(node, 4);
		node = insert(node, 5);
		System.out.println(node);

		node = Reverse(node);
		System.out.println(node);
	}

	public static void main(String[] args) {
		new Test().test();
	}
}