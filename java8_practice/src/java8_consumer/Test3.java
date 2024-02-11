package java8_consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

class Movies {
	String name;
	String hero;
	String heroine;

	public Movies(String name, String hero, String heroine) {
		super();
		this.name = name;
		this.hero = hero;
		this.heroine = heroine;
	}

}

public class Test3 {

	public static void populate(ArrayList<Movies> l) {

		l.add(new Movies("AAA", "BBB", "CCC"));
		l.add(new Movies("EEE", "FFF", "GGG"));
		l.add(new Movies("HHH", "III", "JJJ"));
		l.add(new Movies("KKK", "LLL", "MMM"));

	}

	public static void main(String[] args) {

		ArrayList<Movies> l = new ArrayList<Movies>();
		populate(l);
		
		Consumer<Movies> c =m->{
			System.out.println("Movie anme "+m.name);
			System.out.println("Movie Hero "+m.hero);
			System.out.println("Movie Herone "+m.heroine);
			System.out.println();
			
		};
		
		for(Movies m:l) {
         c.accept(m);			
 		}

	}
}
