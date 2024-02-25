package java8_sorting_concept;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test_Sorting {
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(3, 6, 2, 3, 7, 8, 0);
		
		//Default Sorting
		
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println(l1);
	
		System.out.println("===========================");
 
		//Customized Sorting
		
		List<Integer> l2=l.stream().sorted((I1,I2)->-I1.compareTo(I2)).collect(Collectors.toList());
		System.out.println(l2);
		
		//==================min() and max() value=========================
		long min=l.stream().max((I1,I2)->I1.compareTo(I2)).get();
		System.out.println(min);
		
		//
		long max=l.stream().min((I1,I2)->I1.compareTo(I2)).get();
		System.out.println(max);
		
	
	}
	
	
}
