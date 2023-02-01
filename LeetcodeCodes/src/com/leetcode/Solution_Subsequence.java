package com.leetcode;

public class Solution_Subsequence {
public boolean isSubsequence(String s, String t) {
	int j=0;
	if (s.equals("")) {
		return true;
	}
	for (int i  = 0; i < t.length(); i++) {
		char c=t.charAt(i);
		char c1=s.charAt(j);
		if (c==c1) {
			j++;
		}
		if (j==s.length()) {
			return true;
		}
	}
	return false;
}
public static void main(String[] args) {
	System.out.println(new Solution_Subsequence().isSubsequence("abc","ahbgtc"));
}
}
