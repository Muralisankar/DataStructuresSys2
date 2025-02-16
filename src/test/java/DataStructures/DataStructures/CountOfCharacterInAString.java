package DataStructures.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharacterInAString {

	public static void main(String[] args) {

		String str = "JavaWorld";

		char[] c = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

		for (int i = 0; i < c.length; i++) {
			
			if(!hm.containsKey(c[i])) {
				
				hm.put(c[i], 1);
			}
			else {
				
				hm.put(c[i], hm.get(c[i])+1);
			}

		}
		
		for(Map.Entry<Character, Integer> m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}
}
