package java8_lamda_expression_with_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sorting_ArrayList_Customized_With_Lamda {

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		l.add(40);
		l.add(10);
		l.add(15);
		l.add(5);
		System.out.println(l);
		Comparator<Integer> c = (I1, I2) -> (I1 < I2) ? -1 : (I1 > I2) ? 1 : 0;
		Collections.sort(l, c);
		// System.out.println(l);
		l.stream().forEach(System.out::println);

	}

}
