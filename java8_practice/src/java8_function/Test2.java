package java8_function;

import java.util.function.Function;

public class Test2 {
	
	public static void main(String[] args) {
		Function<String, Integer> f=S->S.length();
		System.out.println(f.apply("santvilas"));;
		
		Function<String, String> f1=S->S.toUpperCase();
		System.out.println(f1.apply("santvilas"));;
	}
	

}
