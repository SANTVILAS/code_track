package assinment_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test02_RemoveDuplicates {

	public static List<Integer> removedDuplicate(List<Integer> list) {

		Set<Integer> set = new HashSet<Integer>();
		List<Integer> duplicate = new ArrayList<Integer>();
		for (Integer x : list) {
			if (set.contains(x)) {
				duplicate.add(x);
			} else {
				set.add(x);
			}
		}
//		System.out.println(duplicate);
		System.out.println(set);

		return duplicate;
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 1, 1, 3, 4, 5, 4, 5);

		System.out.println("===========================================");

		List<Integer> anslist = removedDuplicate(list);
		System.out.println(anslist);

	}

}
