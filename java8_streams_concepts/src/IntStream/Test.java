package IntStream;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println();
		
		IntStream.rangeClosed(1, 10).forEach(System.out::println);
		
		
		
	}

}
