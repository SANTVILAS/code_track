package for_each;

import java.util.Arrays;
import java.util.List;

public class Test2 {

	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("AA","BB","CC","DD","FF","EE");
		
	//	l.stream().forEach(e->System.out.println(e));
		
		l.stream().forEach(System.out::println);
		
		
		
	}
	
}
