package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Make_No_Non_Repeating {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,1,3,3,3,3,2,3,2,1,5,7,7,9);
		List<Integer> list2=list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		
		
	}
}
