package com.leetcode;

public class Solution_MaxProfit {
public int maxProfit(int[] prices) {
	int maxProfit=0;
	int minPrice=prices[0];
	for (int i = 0; i < prices.length; i++) {
		maxProfit=Math.max(maxProfit, prices[i]-minPrice);
		minPrice=Math.min(minPrice, prices[i]);
	}
	return maxProfit;
}
public static void main(String[] args) {
	System.out.println(new Solution_MaxProfit().maxProfit(new int[] {1,2,3,4}));
}
}
