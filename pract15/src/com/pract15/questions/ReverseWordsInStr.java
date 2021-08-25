package com.pract15.questions;

public class ReverseWordsInStr {
	
	public static String reverseWords(String str) {
		String [] arrStr = str.split(" ");
		
		int j=arrStr.length-1;
		
		for(int i=0;i<arrStr.length/2;i++) {
			String temp = arrStr[i];
			arrStr[i] = arrStr[j];
			arrStr[j] =  temp;
		}
		
		String result = String.join(" ", arrStr);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(reverseWords("Hello World !!"));
	}

}
