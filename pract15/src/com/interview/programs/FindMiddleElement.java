package com.interview.programs;

public class FindMiddleElement {
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
	
	public Node findMidElement() {
		Node r1=head ,r2=head;
		while(r1 != null && r2.next != null) {
			r1 = r1.next;
			r2 = r2.next.next;
		}
		return r1;	
	}

	public static void main(String[] args) {
		FindMiddleElement list = new FindMiddleElement();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.print();
		
		System.out.println("-------------------------------------");
		System.out.println(list.findMidElement().data);
	}
}