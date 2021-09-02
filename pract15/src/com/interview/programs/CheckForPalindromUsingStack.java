package com.interview.programs;

import java.util.Stack;

public class CheckForPalindromUsingStack {
	Node head;
	
	Stack<Integer> stack = new Stack<Integer>();
	
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
	
	public boolean isValidPalindrom(){
		Node r0 = head, r1 = head , r2 = head;
		int isOdd=0;
		
		//check if odd or even
		while(r0 != null) {
			r0 = r0.next;
			isOdd++;
		}
				
		while(r1 != null && r2 != null  && r2.next != null) {
			stack.add(r1.data);
			r1 = r1.next;
			r2 = r2.next.next;
		}
		
		System.out.println(stack);
		
		if(isOdd % 2 != 0) {
			r1 = r1.next;
		}
		System.out.println(r1.data);
		//System.out.println("--------"+ r2.data);
		
		while(r1 != null) {
			if(r1.data == stack.peek()) {
				r1 = r1.next;
				stack.pop();
			}
			else {
				return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		CheckForPalindromUsingStack list = new CheckForPalindromUsingStack();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.print();
		
		System.out.println("-------------------------------------");
		System.out.println(list.isValidPalindrom());
	}
	
	
}
