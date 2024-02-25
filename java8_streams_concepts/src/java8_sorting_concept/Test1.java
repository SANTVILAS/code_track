package java8_sorting_concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
public static void main(String[] args) {
	 List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
	 
	 List<String> list1=list.stream().sorted().collect(Collectors.toList());
	 list1.forEach(System.out::println);
	 
	
}
}
