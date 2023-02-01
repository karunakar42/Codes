package com.leetcode;

public class Solution_ClimbStairs {
	public int climbstaris(int n) {
		int ways = 1;
		int count = 1;
		for (int i = 2; i <= n; i++) {
			int curr = ways + count;
			count = ways;
			ways = curr;
		}
		return ways;
	}
	public static void main(String[] args) {
		Solution_ClimbStairs sol=new Solution_ClimbStairs();
		System.out.println(sol.climbstaris(3));
	}
}
