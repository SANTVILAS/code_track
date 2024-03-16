package group_by;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,6,3,4,5,4,3,5,6,7,7,3,5);
		
		Map<Integer, Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		
	}

}
