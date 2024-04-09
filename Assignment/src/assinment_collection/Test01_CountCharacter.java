package assinment_collection;

import java.util.HashMap;
import java.util.Map;

public class Test01_CountCharacter {

	public static void main(String[] args) {

		String str = "aaaccadddeef";
		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (Character c : arr) {
			if (map.get(c) == null) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
    System.out.println(map);
	}
	
}
