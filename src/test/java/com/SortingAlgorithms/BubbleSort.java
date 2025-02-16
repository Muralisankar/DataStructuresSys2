package com.SortingAlgorithms;

public class BubbleSort {
	
	public static void main(String args[]) {
		
		int intArray[] = {20,35,-15,7,55,1,-22};
		
		for(int unsortedArrayIndex=intArray.length-1;unsortedArrayIndex>0;unsortedArrayIndex--) {
			
			for(int i=0;i<unsortedArrayIndex;i++) {
				
				if(intArray[i]>intArray[i+1]) {
					swap(intArray,i,i+1);
				}
			}
		}
		for(int a:intArray) {
			System.out.println(a);
		}
		
	}
	
	public static void swap(int intArray[],int i,int j) {
		
		if(i==j) {
			return;
		}
		
		int temp = intArray[i];
		intArray[i] = intArray[j];
		intArray[j] = temp;
	}

}
