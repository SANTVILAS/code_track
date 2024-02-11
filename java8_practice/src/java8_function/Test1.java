package java8_function;

import java.util.function.Function;

public class Test1 {
	public static void main(String[] args) {
		Function<Integer, Integer> f = I->I*I;
		System.out.println(f.apply(4));
		
	}

}
