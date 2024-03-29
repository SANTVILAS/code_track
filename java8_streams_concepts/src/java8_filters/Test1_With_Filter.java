package java8_filters;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1_With_Filter {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(list);

		List<Integer> l2 = list.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);

	}

}
