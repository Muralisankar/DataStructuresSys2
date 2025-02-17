package Recursive;

public class PermutationOfAString {
	
	public static void main(String[] args) {
		
		printPermutation("ABC","");
		
	}
	
	public static void printPermutation(String Input, String result) {
		
		if(Input.length()==0) {
			
			System.out.println(result+" ");
			return;
		}
		
		
		for(int i=0;i<Input.length();i++) {
			
			char ch = Input.charAt(i);
			
			String rest = Input.substring(0,i) + Input.substring(i+1);
			printPermutation(rest, result+ch);
		}
		
	}

}
