package com.leetcode;

public class TrappingRainWater {
	int trapWater(int size,int[] arr) {
		int capacity = 0,highVal=0;
		for (int i = 0; i <size; i++) {
			if (highVal<arr[i])
				highVal=arr[i];
			else 
				capacity+=highVal-arr[i];
		}
		return capacity;
	}
	public static void main(String[] args) {
		System.out.println(new TrappingRainWater()
				.trapWater(6,new int[] {3,0,0,2,0,4}));
	}
}
