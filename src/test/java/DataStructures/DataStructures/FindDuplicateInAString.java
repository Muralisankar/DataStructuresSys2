package DataStructures.DataStructures;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateInAString {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String s = "aaa bbb vvv ccc rrr ddd aaa vvv";
		String[] str = s.split(" ");
		StringBuffer sb = new StringBuffer();
		StringBuffer sb1 = new StringBuffer();
		for (int i = 0; i < str.length; i++) {

			if (!map.containsKey(str[i])) {

				map.put(str[i], 1);
			} else {
				map.put(str[i], map.get(str[i]) + 1);
			}

		}

		for (Map.Entry<String, Integer> m : map.entrySet()) {

			System.out.println(m.getKey() + " " + m.getValue());

			if (m.getValue() > 1) {

				sb.append(m.getKey() + " ");
			}

			sb1.append(m.getKey() + " ");

		}

		System.out.println("duplicate strings are :" + sb.toString());
		System.out.println("Strings without duplicates are :" + sb1.toString());

	}

}
