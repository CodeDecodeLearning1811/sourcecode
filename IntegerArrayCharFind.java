package com.learn.collection;

import java.util.ArrayList;
import java.util.List;

public class IntegerArrayCharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intValues = {11,123,456,89,18,79,167};
		List<Integer> resultValue = new ArrayList<>();
		char specifiedChar = '1';
		for(int num : intValues) {
			if(Integer.toString(num).charAt(0)==specifiedChar) {
				
				resultValue.add(num);
			}
		}
		System.out.println(resultValue);

	}

}
