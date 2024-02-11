package java8_consumer;

import java.util.function.Consumer;

class Movie{
	String name;

	public Movie(String name) {
		super();
		this.name = name;
	}
	
	
	
}

public class Test1 {

	public static void main(String[] args) {
		Consumer<Movie> c1=m->System.out.println(m.name+"Ready to Releae");
		Consumer<Movie> c2=m->System.out.println(m.name+"Ready to Releae but it is flop");
		Consumer<Movie> c3=m->System.out.println(m.name+"Storing information data");
		
		
		
		Movie m =new Movie("Spider");
		c1.accept(m);
		c2.accept(m);
		c3.accept(m);
		
		
		
	}
}
