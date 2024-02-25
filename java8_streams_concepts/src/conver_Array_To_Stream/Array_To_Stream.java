package conver_Array_To_Stream;

import java.util.stream.Stream;

public class Array_To_Stream {

	public static void main(String[] args) {
		String names[] = { "sant", "vilas", "keshari", "Gupta", "Monu" };
		
		Stream<Object> stream1=Stream.of(names);
		
	     stream1.forEach(e->{
	    	 
	    	 System.out.println(e);
	     });
	}
	
}
