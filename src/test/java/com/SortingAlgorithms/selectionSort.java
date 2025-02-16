package com.SortingAlgorithms;

public class selectionSort {
	
	public static void main(String args[]) {
		
		int intArray[] = {20,35,-15,7,55,1,-22};
		
		for(int unsortedIndex = intArray.length-1;unsortedIndex>0;unsortedIndex--) {
			
			int largest = 0;
			for(int i=1;i<=unsortedIndex;i++) {
				if(intArray[i]>intArray[largest]) {
					largest = i;
				}
				
			}
			
			swap(intArray,largest,unsortedIndex);
			for(int a:intArray) {
				System.out.print(a+",");
			}
			System.out.println();
		}
		System.out.println("Final output");
		for(int a:intArray) {
			System.out.print(a+",");
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
