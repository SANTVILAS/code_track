package java8_filters;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test3_No_greater_Than_9 {
public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(1,2,3,5,67,8,9,054,56,7,788,5445,44);
	List<Integer> list2=list1.stream().filter(i->i>9).collect(Collectors.toList());
	System.out.println(list2);
	
	
	
}
}
