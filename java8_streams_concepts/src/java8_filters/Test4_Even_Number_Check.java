package java8_filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4_Even_Number_Check {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(10,15,20,35,30,40,45,50);
		List<Integer> list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list2);
		
		
	}
}
