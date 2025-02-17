package DataStructures.DataStructures;

public class StringPallindrom {
	

	public static void main(String args[]) {
		
		String str = "231";
		String strReverse = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			
			strReverse = strReverse+str.charAt(i);
		}
		
		System.out.println("Given str :"+str);
		System.out.println("Reverse str :"+strReverse);
		
		if(str.equals(strReverse)) {
			
			System.out.println("Given String is a pallindrome");
		}
		else {
			System.out.println("Given String is not a pallindrome");
		}
	}
}
