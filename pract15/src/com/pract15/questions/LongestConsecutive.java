package com.pract15.questions;

import java.util.HashSet;

public class LongestConsecutive {

	public int solution1(int[] nums) {
		int maxSeqLen = 0;

		for (int i = 0; i < nums.length; i++) {
			int currentNum = nums[i];
			int currentSeqLen = 1;

			while (isNumExist(nums, currentNum + 1)) {
				currentNum = currentNum + 1;
				currentSeqLen = currentSeqLen + 1;
			}

			maxSeqLen = Math.max(maxSeqLen, currentSeqLen);
		}
		return maxSeqLen;
	}

	private boolean isNumExist(int[] nums, int i) {
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == i) {
				return true;
			}
		}
		return false;
	}

	public int solution2(int[] nums) {
		int maxSeqLen = 0;

		HashSet<Integer> set = new HashSet<Integer>();

		for (int num : nums) {
			set.add(num);
		}

		for (int i = 0; i < nums.length; i++) {
			int currentNum = nums[i];
			int currentSeqLen = 1;

			if (!set.contains(currentNum - 1))
				while (set.contains(currentNum + 1)) {
					currentNum = currentNum + 1;
					currentSeqLen = currentSeqLen + 1;
				}

			maxSeqLen = Math.max(maxSeqLen, currentSeqLen);
		}
		return maxSeqLen;
	}

	public static void main(String[] args) {
		LongestConsecutive l = new LongestConsecutive();
		int[] nums = new int[] { 100, 1, 2, 3, 200, 4 };
		System.out.println(l.solution1(nums));
		System.out.println(l.solution2(nums));;
	}

}
