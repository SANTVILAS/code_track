package streams_gfg;

import java.util.stream.Stream;

//print first n natural number with given digit d

public class Test1 {

public static void main(String[] args) {
	Stream.iterate(1, x->x+1)
	.filter(x->x.toString().contains("5"))
	.limit(10)
	.forEach(System.out::println);
	
}	
	
}
