package java8_sorting_concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GFG {
	public static void main(String[] args) {
		// Creating a list of integers
		List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
		list.stream().sorted().forEach(System.out::println);
       
	}

}
