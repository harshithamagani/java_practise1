package com.pract15.questions;

public class RmvDupNumsFromSortedArr {
	//Remove Duplicates from Sorted Array
	
	//Two pointer approach without using extra space
	
	public int remvDupFromArr(int [] arr){
		
		int j=1;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j++]=arr[i+1];
			}
		}
		
		return j;
	}
	
	public static void main(String[] args) {
		//Input: nums = [1,1,2]
		//Output: 2, nums = [1,2,_]
		
		int [] nums = new int [] {1,1,2};
		
		RmvDupNumsFromSortedArr r = new RmvDupNumsFromSortedArr();
		
		int size = r.remvDupFromArr(nums);
		System.out.println(size);
	}
}
