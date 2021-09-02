package com.interview.programs;

public class RemoveDupsfromSortedList {

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

	public void print() {
		Node runner = head;
		while (runner != null) {
			System.out.println(runner.data);
			runner = runner.next;
		}
	}

	public void remDupFromSortedList() {
		Node p1 = head;

		while (p1 != null) {
			Node temp = p1;
			
			while(temp != null && temp.data == p1.data){
				temp = temp.next;
				
			}
			
			p1.next = temp;
			p1 = p1.next;
		}
	}

	public static void main(String[] args) {
		RemoveDupsfromSortedList list = new RemoveDupsfromSortedList();
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(4);
		list.print();
		System.out.println("-------------------------------------");

		list.remDupFromSortedList();
		list.print();
		
	}
}
