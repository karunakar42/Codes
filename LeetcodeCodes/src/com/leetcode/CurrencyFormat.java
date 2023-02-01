package com.leetcode;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CurrencyFormat {
	public List<String> format(double[] values){
		List<String> arr=new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			
			//With Predefined classes
//	arr.add(NumberFormat.getCurrencyInstance(Locale.US).format(values[i]));
			
			//Without predefined classes
			arr.add(String.format("$"+"%,.2f", values[i]));
		}
 		return arr;
	}
	public static void main(String[] args) {
		System.out.println(new CurrencyFormat().
				format(new double[] 
						{625615.7528,73465147.008,41624.2712,274.0009}));
	}
}
