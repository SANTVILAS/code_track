package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDistinctWithString {

public static void main(String[] args) {
		
		List<String> list=Arrays.asList("sant","sant","vilas","vilas","keshari");
		List<String> list1=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list1);
		
	}
	
}
