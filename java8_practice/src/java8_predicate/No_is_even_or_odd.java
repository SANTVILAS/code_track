package java8_predicate;

import java.util.function.Predicate;

public class No_is_even_or_odd {
	public static void main(String[] args) {
		Predicate<Integer> p=I-> I%2==0;
		System.out.println(p.test(10));
		
		
	}

}
