package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromSet {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3,2,1,3,4,6,7);
		Set<Integer> list1=list.stream().distinct().collect(Collectors.toSet());
		System.out.println(list1);
		System.out.println();
	}

}
