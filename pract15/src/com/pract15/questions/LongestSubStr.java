package com.pract15.questions;

import java.util.HashSet;

public class LongestSubStr {
	//Longest Sub string Without Repeating Characters
	//sliding window problem using two pointing and updating the max length
	
	public int longestSubStrLength(String str) {
		int i=0;
		int j=0;
		int max=0;
		
		HashSet<Character> set = new HashSet<Character>();
		
		while(j<str.length()) {
			if(!set.contains(str.charAt(j))) {
				set.add(str.charAt(j));
				j++;
				max = Math.max(set.size(), max);
			} else {
				set.remove(str.charAt(i));
				i++;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		LongestSubStr l = new LongestSubStr();
		
		System.out.println(l.longestSubStrLength("abcabcbb"));
	}

}
