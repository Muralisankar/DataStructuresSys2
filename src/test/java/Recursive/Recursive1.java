package Recursive;

public class Recursive1 {
	
	
	public static void main(String[] args) {
		
		printNos(1);
		
	}
	
	public static void printNos(int i) {
		
		if(i==5) {
			return;
		}
		System.out.println(i);
		i++;
		
		printNos(i);
	}

}
