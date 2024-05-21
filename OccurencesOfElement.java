package com.learn.collection;

public class OccurencesOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,2,4,2,5,2,6,2};
		int occEle = 2;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==occEle) {
				count++;
			}
			
		}
		System.out.println("Occurances of element 2 is : "+count);
	}

}
