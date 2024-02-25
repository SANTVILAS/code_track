package for_each;

import java.util.stream.Stream;

public class Test2_Blank_Stream {

	public static void main(String[] args) {
		
		Stream<Object> emptyObject =Stream.empty();
		emptyObject.forEach(e->{
			System.out.println(e);
		});
	}
}
