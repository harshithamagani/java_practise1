package com.pract15.questions;

import java.util.HashMap;
import java.util.Stack;

public class BalanceBrackets {
	//HashMap and Stack

	public boolean isBalanceBrackets(String str) {
		char [] brackets = str.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('}', '{');
		map.put(')', '(');
		map.put(']', '[');
		
		
		for(int i=0;i<brackets.length;i++) {
			char test = brackets[i];
			
			if(map.containsKey(test)) {
				
				if(!stack.isEmpty()) {
					char topElement = stack.pop();
					
					if(topElement != map.get(test)) {
						return false;
					}
				}
			}
			else {
				stack.push(test);
			}
		}
		return stack.isEmpty();		
}
	
	
	public static void main(String[] args) {
		String s = "()[]{}";
		BalanceBrackets b= new BalanceBrackets();
		System.out.println(b.isBalanceBrackets(s));
		 
	}
}
