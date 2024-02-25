package java8_sorting_concept;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_Method {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(0);
		al.add(20);
		al.add(5);
		al.add(15);
		al.add(10);

		System.out.println(al);

		List<Integer> l1 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
		
		List<Integer> l2=al.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println(l2);

	}

}
