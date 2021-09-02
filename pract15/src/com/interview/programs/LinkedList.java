package com.interview.programs;

public class LinkedList {
	Node head;

	public void add(int data) {
		if (head == null) {
			Node newNode = new Node(data);
			head = newNode;
		} else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			Node newNode = new Node(data);
			runner.next = newNode;
		}
	}

	public void remove(int data) {
		if (head == null) {
			return;
		} else {
			Node runner = head;
			if (head.data == data) {
				if (head.next == null) {
					head = null;
				} else {
					head = head.next;
				}
			}
			while (runner.next != null && runner.next.next != null) {
				if (runner.next.data == data) {
					runner.next = runner.next.next;
				}
				runner = runner.next;
			}
			if (runner.next.data == data) {
				runner.next = null;
			}
		}
	}

	public void print() {
		Node runner = head;
		while (runner != null) {
			System.out.println(runner.data);
			runner = runner.next;
		}
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);

		list.print();
		System.out.println("-------------------------------------");
		list.remove(13);
		list.print();

	}

}
