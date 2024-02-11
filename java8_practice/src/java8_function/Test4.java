package java8_function;
//No of spaces present in the String

import java.util.function.Function;

//
public class Test4 {

	public static void main(String[] args) {

		String str = "I am the best person";
		Function<String, Integer> f = S -> S.length() - S.replaceAll(" ", "").length();
		System.out.println(f.apply(str));
	}

}
