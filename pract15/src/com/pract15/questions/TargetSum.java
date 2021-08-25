package com.pract15.questions;

import java.util.Arrays;

public class TargetSum {
	
	//Given an array of integers, find two numbers such that they add up to a specific target number
	
	public int[] findNumsWithTargetSum(int target, int[] arr){
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == target) {
					return new int [] {i,j};
				}
			}
			
		}
			
		return null;
	}
	
	public static void main(String[] args) {
		
		//int [] nums = new int[] {2,7,11,15};
		//int target = 9;
		
		int [] nums = new int[] {3,2,4};
		int target = 6;
		
//		int [] nums = new int[] {3,3};
//		int target = 6;
		
		
		TargetSum t = new TargetSum();
		int [] result = t.findNumsWithTargetSum(target, nums);
		System.out.println(Arrays.toString(result));
	}

}
