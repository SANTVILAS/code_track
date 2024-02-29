package udemy_method_reference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUpperCaselamda=(s)->s.toUpperCase();
	
	static Function<String, String> toUpperMethodReference = String::toUpperCase;
	
	public static void main(String[] args) {
		
		System.out.println(toUpperCaselamda.apply("java8"));
		
		System.out.println(toUpperMethodReference.apply("java8"));
	}
	
}
