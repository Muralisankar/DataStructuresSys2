package com.Arrays;

public class testArrays {
	
	public static void main(String args[]) {
		
		int intArrays[] = new int[7];
		intArrays[0] = 20;
		intArrays[1] = 35;
		intArrays[2] = -15;
		intArrays[3] = 7;
		intArrays[4] = 55;
		intArrays[5] = 1;
		intArrays[6] = -22;
		
		for(int i=0;i<intArrays.length;i++) {
			System.out.println(intArrays[i]);
		}
		
		for(int a:intArrays) {
			System.out.println("the for each loop : "+a);
		}
		
	}

}
